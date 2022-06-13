package com.Acharya.StaticKeyword;

public class Student2 {
	int rollno;
	String name;
	static String college;
	static {
		college = "AIT";
	}
	Student2(int r, String n)
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
		Student2 s1 = new Student2(406, "Waseem");
		Student2 s2 = new Student2(544,  "Alam");
		change();
		s1.display();
		s2.display();


	}

}
