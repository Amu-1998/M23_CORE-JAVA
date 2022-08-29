package com.cg.annotations;

import java.util.Scanner;

class Animal
{
	Animal()
	{
		System.out.println("Lion");
	}
	public void sound()
	{
		System.out.println("Roars");
	}
}

public class SuppressWarningAnnotation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		@SuppressWarnings("unused")
		Animal a = new Animal();
		s.close();

	}

}
