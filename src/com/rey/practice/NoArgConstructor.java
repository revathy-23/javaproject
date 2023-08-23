package com.rey.practice;

public class NoArgConstructor {
	int b=20;
	int a=100;
	
	
	NoArgConstructor(){
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		NoArgConstructor n=new NoArgConstructor();
		
	}

}
