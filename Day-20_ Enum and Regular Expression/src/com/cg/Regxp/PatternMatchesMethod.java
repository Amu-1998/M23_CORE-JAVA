package com.cg.Regxp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternMatchesMethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String pattern="JAVA&Programming";
		String input=s.nextLine();
		boolean result= Pattern.matches(pattern, input);
		System.out.println(result);
		s.close();

	}

}
