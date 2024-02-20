package com.HirarchicalInheritance;

public class Solution {
	public static void main(String[] args) {
		Student s=new Student();
		s.study();
		System.out.println(s.name);
		System.out.println(s.mark);
		
		Employee e=new Employee();
		e.work();
		System.out.println(e.salary);
		System.out.println(e.name);
	}

}
