package com.cg.abstractkeyword;
//abstract class
abstract class Flower {
	//abstract method
	abstract void print();
	//non abstract
	void accept() {
		System.out.println("Demo on abstract keyword");
	}
}
class Lily extends Flower {
	void print() {
		System.out.println("Hey folks!");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		//we can't create for abstract class
		//Flower f = new Flower();
		Lily l=new Lily();
		l.print();
		l.accept();
		

	}

}
