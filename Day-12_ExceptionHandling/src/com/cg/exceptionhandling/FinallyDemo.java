package com.cg.exceptionhandling;

public class FinallyDemo 
{
	 
		 public static void print(int[] arr) {
		        System.out.println(arr[2]);
		        System.out.println("Fourth element successfully displayed!");
		 }
	

	public static void main(String[] args)
	{
		System.out.println("First line");
        System.out.println("Second line");
        
        try
        {
        int[] myIntArray = new int[]{1, 2, 3};
        print(myIntArray);
        
        //finally block will not execute because of below line
        System.exit(0);
        }
        
        catch(Exception e)
        {
        	System.out.println(e);
        }
        /*finally
        {
        	// finally block will not execute when it contains an exception
        	int c=12/0;
        	System.out.println("Finally Block is always executed");
        }*/
        System.out.println("Third Line");
     

	}

}
