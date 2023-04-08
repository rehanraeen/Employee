package com.daoEmployee;

import java.util.HashMap;
import java.util.Scanner;

import com.beanEmployee.BeanEmp;

public class EmpMethod extends BeanEmp implements EmpInterface  {

	Scanner sc = new Scanner(System.in);
	Scanner s = new Scanner(System.in);
	int id;
	
	@Override
	public void registerEmp(HashMap<Integer, BeanEmp> hm, EmpMethod em, Scanner src) {
		
		
		System.out.println("input the number of student");
		int no = src.nextInt();
		
		for (int i = 1; i<=no; i++) {
			BeanEmp be = new BeanEmp();
		System.out.println("Enter ID");
		be.setId(sc.nextInt());
		
		System.out.println("Enter Name");
		be.setName(s.nextLine());
		//src.nextLine();
		
		System.out.println("Enter City");
		be.setCity(s.nextLine());
		
		System.out.println("Enter Des");
		be.setDes(s.nextLine());
		
		System.out.println("Enter PhoneNo");
		be.setPhoneNo(sc.nextLong());
		//src.next();
		System.out.println("Enter Password");
		be.setPassword(sc.nextLong());
		
		hm.put(be.getId(), be);
		}
		
	}

	@Override
	public void insertEmp(HashMap<Integer, BeanEmp> hm, BeanEmp be, EmpMethod em, Scanner src) {
		
	}

	@Override
	public BeanEmp updateEmp(HashMap<Integer, BeanEmp> hm, BeanEmp be, EmpMethod em, Scanner src) {
		System.out.println("Enter Name");
		be.setName(s.nextLine());
		
		System.out.println("Enter City");
		be.setCity(s.nextLine());
		
		System.out.println("Enter Des");
		be.setDes(s.nextLine());
		
		System.out.println("Enter PhoneNo");
		be.setPhoneNo(sc.nextLong());
		//src.next();
		System.out.println("Enter Password");
		be.setPassword(sc.nextLong());
		return em;
	}

	@Override
	public void deleteEmp(HashMap<Integer, BeanEmp> hm, BeanEmp be, EmpMethod em, Scanner src) {
		System.out.println("Enter ID you want to Delete");
		id=src.nextInt();
		System.out.println(hm.remove(id));
		System.out.println(hm);
		}

	@Override
	public void fetchEmp(HashMap<Integer, BeanEmp> hm, BeanEmp be, EmpMethod em, Scanner src) {
		System.out.println("Enter ID you want to see");
		id=src.nextInt();
		System.out.println(hm.get(id));
		
	}

}
