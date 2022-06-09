package com.acharya.constructor;

class Worker {
	int id;
	String name;
	float salary;
	
	//User defined parameterized constructor
	public Worker(int i, String n, float s) {
		id=i;
		name=n;
		salary=s;
	}
	
	//Method
	void display() {
		System.out.println(id+ " " + name + " " + salary);
	}

public class Worker1 {

	public static void main(String[] args) {
		Worker w1 = new Worker(786, "Manzar", 40000f);
		Worker w2 = new Worker(224,  "Ashish", 30000f);
		w1.display();
		w2.display();

	}

}
}
