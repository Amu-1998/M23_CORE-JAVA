package coom.cg.array;

import java.util.Scanner;

public class ArrayDemoUserInput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=s.nextInt();
		//array declaration
		int arr[]=new int[size];
		System.out.println("Enter the values: ");
		//to enter the elements in the array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+i+" index");
			arr[i]=s.nextInt();
	}
		//To print the elements in the array
		//for(int i=0;i<arr.length;i++)
		//{
			//System.out.println(arr[i]);
		//}
		//enhanced for loop instead of above we can write it like this
		for(int j:arr)
		{
			System.out.println(j);
		}
		}

}
