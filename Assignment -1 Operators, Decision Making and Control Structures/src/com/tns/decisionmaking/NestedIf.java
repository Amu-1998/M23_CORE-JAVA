package com.tns.decisionmaking;

public class NestedIf {

	public static void main(java.lang.String[] args) {
		int age=22, weight=101;
		if(age>12)
		{
			if(weight>=40) 
			{
				if(weight<=100)
					System.out.println("Eligible for bunjee jumping");
				else {
						System.out.println("Not eligible");
					}
			}
			else {
				System.out.println("Extra ropes will be added");
			}
		}
		else {
			System.out.println("Not Eligible");
			
		}

	}

}
