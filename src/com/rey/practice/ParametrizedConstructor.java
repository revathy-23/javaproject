package com.rey.practice;

public class ParametrizedConstructor {
	String name;
	String sex;
	int age;
	
  
	ParametrizedConstructor(String name,String sex, int age){
		this.name=name;
		this.sex=sex;
		this.age=age;
		
	}
	
	public static void main(String[] args) {
		
		
		ParametrizedConstructor p=new ParametrizedConstructor("shiva", "male", 50);
		System.out.println(p.name);
		System.out.println(p.sex);
		System.out.println(p.age);
		
	}
	
}
