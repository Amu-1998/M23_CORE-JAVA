package com.cg.polymorphism;
//prgm on constructor overloading
class Triber
{
	int speed;
	String engine;
	Triber()
	{
		System.out.println("Renaualt kiger ");
	}
	//two parameter
	Triber(int speed, String engine)
	{
		this.speed=speed;
		this.engine=engine;
		System.out.println("Speed is: "+speed +" and the engine is on: "+engine);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Triber t=new Triber();
		@SuppressWarnings("unused")
		Triber t1=new Triber(45,"Disel");
		

	}

}
