package com.cg.inheritance;
//multilevel inheritance
class Bike{
	protected int speed;
	void display() {
		System.out.println("I like to ride bike");
	}
}
class Pulser extends Bike
{
	protected String color;
	void print() {
		System.out.println("Speed is: "+speed);
	}
}
class Pulser125 extends Pulser
{
	void accept() {
	System.out.println("color is: "+color);
	}
}
public class MultiLevelInheritance
{

	public static void main(String[] args) {
		Pulser125 p=new Pulser125();
		p.color="Black";
		p.speed=70;
		p.accept();
		p.print();
		p.display();

	}

}
