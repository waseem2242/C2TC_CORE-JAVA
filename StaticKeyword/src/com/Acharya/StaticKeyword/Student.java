package com.Acharya.StaticKeyword;


public class Student {
	int rollno;
	String name;
	static String college = "AIT";
	Student(int r, String n)
	{
		rollno = r;
		name = n;
	}
	void display ()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	

	public static void main(String[] args) {
		Student s1 = new Student(406, "Waseem");
		Student s2 = new Student(544,  "Alam");
		s1.display();
		s2.display();

	}

}
