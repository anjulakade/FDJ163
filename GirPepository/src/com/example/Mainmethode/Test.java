package com.example.Mainmethode;

import com.example.Model.Student;

public class Test 
{
	public void m1()
	{
		Student s=new Student();
		s.setId(111);
		s.setName("anjali");
		s.setEmail("anju145@gmail.com");
		s.setAge(24);
		
		Student s1=new Student();
		s1.setId(112);
		s1.setName("manu");
		s1.setEmail("manu145@gmail.com");
		s1.setAge(26);
		
		Student s2=new Student();
		s2.setId(113);
		s2.setName("anu");
		s2.setEmail("anu123@gmail.com");
		s2.setAge(24);
	System.out.println(s.getId());
	System.out.println(s.getName());
	System.out.println(s.getEmail());
	System.out.println(s.getAge());
	
	
	
	System.out.println(s1.getId());
	System.out.println(s1.getName());
	System.out.println(s1.getEmail());
	System.out.println(s1.getAge());
	
	
	
	
	System.out.println(s2.getId());
	System.out.println(s2.getName());
	System.out.println(s2.getEmail());
	System.out.println(s2.getAge());
	
	}

	public static void main(String[] args)
	{
	   Test t=new Test();
	   t.m1();
		

	}

}
