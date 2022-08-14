package com.tns.string;

import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		//System.out.println(str1.length());
		//System.out.println(str1.charAt(4));
		//System.out.println(str1.toUpperCase());
		System.out.println(10+20+"hello"+"World"+10+20);
		System.out.println(str1.concat(str2));
		s.close();
	}
}
