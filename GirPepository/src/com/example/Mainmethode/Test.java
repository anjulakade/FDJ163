package com.example.Mainmethode;

import com.example.Model.Student;

public class Test 
{
	public void m1()
	{
		Student s=new Student();
		s.setId(111);
		s.setName("anjali");
		s.setEmail("anju145");
		s.setAge(24);
		
		Student s1=new Student();
		s1.setId(111);
		s1.setName("anjali");
		s1.setEmail("anju145");
		s1.setAge(24);
	System.out.println(s.getId());
	System.out.println(s.getName());
	System.out.println(s.getEmail());
	System.out.println(s.getAge());
	System.out.println(s1.getId());
	System.out.println(s1.getName());
	System.out.println(s1.getEmail());
	System.out.println(s1.getAge());
	}

	public static void main(String[] args)
	{
	   Test t=new Test();
	   t.m1();
		

	}

}
