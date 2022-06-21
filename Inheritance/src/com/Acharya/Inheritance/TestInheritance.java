package com.Acharya.Inheritance;
class School {
	void teach()
	{
		System.out.println("teachin...");
	}
}
class SecA extends School {
	void music()
	{
		System.out.println("playing music...");
	}
}
class SecB extends School {
	void play()
	{
		System.out.println("playing cricket...");
	}
}
public class TestInheritance {

	public static void main(String[] args) {
		SecB b=new SecB();
		SecA a=new SecA();
		b.play();
		a.music();

	}

}
