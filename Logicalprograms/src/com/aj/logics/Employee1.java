package com.aj.logics;

import java.util.Comparator;
import java.util.HashMap;

public class Employee1 implements Comparator, Comparable {

	int id;
	String name;
	double sal;

	public Employee1(int id, String name, double sal) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.sal = sal;
		this.name = name;
	}

	public static void main(String[] args) {
		Employee1 emp = new Employee1(101, "ajay", 1230.00);
		Employee1 emp1 = new Employee1(102, "anil", 11230.00);
		HashMap map = new HashMap();
		map.put("1", emp);
		map.put("2", emp);
		System.out.println(emp.compareTo(map));
	}

	@Override
	public int compare(Object obj, Object obj1) {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		return (int) 0.;
	}
}
