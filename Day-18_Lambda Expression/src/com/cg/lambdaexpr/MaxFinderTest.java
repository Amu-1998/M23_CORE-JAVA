package com.cg.lambdaexpr;

public class MaxFinderTest {

	public static void main(String[] args) {
		MaxFinder obj = (a,b)-> a>b?a:b;
		System.out.println("The greatest value is " +obj.maximum(23, 30));
	}

}
