package com.acharya.constructor;

class Employee {
	int id;
	String name;
	float salary;
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	//Method
	void display() {
		System.out.println(id+ " " + name + " " + salary);
	}
	
}
public class Employee1 {

	public static void main(String[] args) {
		Employee e1 = new Employee(111, "Waseem", 50000f);
		Employee e2 = new Employee(222,  "Alam", 50000f);
		e1.display();
		e2.display();

	}

}
