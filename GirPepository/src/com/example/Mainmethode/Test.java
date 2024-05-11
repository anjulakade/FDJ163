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
	System.out.println(s.getId());
	System.out.println(s.getName());
	System.out.println(s.getEmail());
	System.out.println(s.getAge());
	}

	public static void main(String[] args)
	{
	   Test t=new Test();
	   t.m1();
		

	}

}
