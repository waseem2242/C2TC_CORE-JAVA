package com.Acharya.StaticKeyword;

public class Student1 {
	int rollno;
	String name;
	static String college = "AIT";
	Student1(int r, String n)
	{
		rollno = r;
		name = n;
	}
	static void change() {
		college = "MWA";
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args) {
		Student1 s1 = new Student1(406, "Waseem");
		Student1 s2 = new Student1(544,  "Alam");
		change();
		s1.display();
		s2.display();


	}

}
