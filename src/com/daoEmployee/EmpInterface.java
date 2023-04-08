package com.daoEmployee;

import java.util.HashMap;
import java.util.Scanner;

import com.beanEmployee.BeanEmp;

public interface EmpInterface {
	
	void registerEmp(HashMap<Integer,BeanEmp> hm,EmpMethod em,Scanner src);
	void insertEmp(HashMap<Integer,BeanEmp> hm,BeanEmp be,EmpMethod em,Scanner src);
	BeanEmp updateEmp(HashMap<Integer,BeanEmp> hm,BeanEmp be,EmpMethod em,Scanner src);
	void deleteEmp(HashMap<Integer,BeanEmp> hm,BeanEmp be,EmpMethod em,Scanner src);
	void fetchEmp(HashMap<Integer,BeanEmp> hm,BeanEmp be,EmpMethod em,Scanner src);

}
