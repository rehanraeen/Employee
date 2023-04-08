package com.controllerEmployee;

import java.util.HashMap;
import java.util.Scanner;
import com.beanEmployee.BeanEmp;
import com.daoEmployee.EmpMethod;

public class EmpCont {
	
	

	public static void main(String[] args) {

		HashMap<Integer,BeanEmp> hm = new HashMap<>();
		BeanEmp be = new BeanEmp();
		Scanner src = new Scanner(System.in);
		EmpMethod em = new EmpMethod();
		
		
		System.out.println("Welcome To Register Form");
		em.registerEmp(hm, em, src);
		System.out.println(hm.toString());
		
		System.out.println("Press 1 to Update");
		System.out.println("Press 2 to Delete");
		System.out.println("Press 3 to See Data");
		System.out.println("Enter 0 if you want to Exit");
		
		int no= src.nextInt();
		
		if(no==1) {
			System.out.println("Enter ID you want to Update");
			int id=src.nextInt();
			System.out.println(hm.replace(id, em.updateEmp(hm, be, em, src)));
		}
		else if(no==2) {
			em.deleteEmp(hm, be, em, src);
			
		}
		else if(no==3) {
			em.fetchEmp(hm, be, em, src);
		}
		else if(no==0) {
			
		}
		
		
		

	}

}
