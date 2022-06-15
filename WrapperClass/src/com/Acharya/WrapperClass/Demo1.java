package com.Acharya.WrapperClass;

public class Demo1 {

	public static void main(String[] args) {
		Integer a=20;
		Integer i=Integer.valueOf(a); //Converting int into Integer expliicitly
		Integer j=a; //Autoboxing
		System.out.println(a+" "+i+" "+j);

	}

}
