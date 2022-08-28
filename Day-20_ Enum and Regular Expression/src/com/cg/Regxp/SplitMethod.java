package com.cg.Regxp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SplitMethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		// "//d" belongs to digit
		String delimeter="\\d";
		
		//String will split by digit
		Pattern p = Pattern.compile(delimeter,Pattern.CASE_INSENSITIVE);
		String res[]=p.split(str);
		for(String i:res)
		{
		System.out.println(i+" ");
		}
		s.close();
		

	}
}
