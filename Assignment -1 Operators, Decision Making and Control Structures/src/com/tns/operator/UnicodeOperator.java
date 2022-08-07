package com.tns.operator;

import java.util.Scanner;

public class UnicodeOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c='\u0021';
		System.out.println((int)c);
        s.close();
	}

}
