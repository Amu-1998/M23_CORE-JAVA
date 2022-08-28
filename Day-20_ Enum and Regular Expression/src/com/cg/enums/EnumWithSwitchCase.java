package com.cg.enums;

import java.util.Scanner;

enum Movie
{
	//enum constants
	KGF2,Brahmashtra,Pushpa,Major;
}

public class EnumWithSwitchCase 
{
	//enum variable
	Movie movie;
	
	//constructor for the  "EnumWithSwitchCase"
	public EnumWithSwitchCase(Movie movie)
	{
		//as enum var and constructor arg var is same use "this" keyword.
		this.movie=movie;
		
	}
	public void display(){ 
		
	
	//using switch to display the actorname of the constants(movie)
	{
		switch(movie)
		{
		case KGF2:
			System.out.println("Yash and Srinidhi");
			break;
		case Brahmashtra:
			System.out.println("Ranbir kapoor and Alia Bhatt");
			break;
		case Pushpa:
			System.out.println("Allu Arjun and Rasmika");
			break;
		case Major:
			System.out.println("Adivi sesh and sailee Manjrekar");
			break;
			default:
				System.out.println("sorry!");
				
		
				}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the movie name to see the co-stars");
		String str = s.nextLine();
		
		//valueof is used to get the constants whose value is passed as an argument while calling the method
		EnumWithSwitchCase obj=new EnumWithSwitchCase(Movie.valueOf(str));
		obj.display();
		s.close();
		
	}
}
