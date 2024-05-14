package com.collection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
	public static void main(String[] args) {
		List<Employee> list2 = new ArrayList<>();
		List<Employee> list = new ArrayList<>();
		Employee emp1 = new Employee(12,"Sameer",19);
		Employee emp2 = new Employee(13,"Aadil Noor",20);
		Employee emp3 = new Employee(14,"Yasir",20);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		for (Employee emp : list) {
			emp.setAge(18);
			list2.add(emp);
		}
		list2.forEach(System.out::println);
		
	}

}
