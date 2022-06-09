package com.acharya.constructor;
class Student {
	int age;
	String name;
	int usn;
	
	//User defined parameterized constructor
	public Student(int a, String n, int u) {
		age=a;
		name=n;
		usn=u;
	}
	//Method
	void display() {
		System.out.println(age+ " " + name + " " + usn);
	}
}

public class Student1 {

	public static void main(String[] args) {
		Student s1 = new Student(22, "Waseem", 545);
		Student s2 = new Student(21,  "Alam", 406);
		s1.display();
		s2.display();

	}

}
