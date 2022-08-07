package com.tns.decisionmaking;

public class CascadedIfElse {

	public static void main(java.lang.String[] args) {
		int a=11,b=7,c=23;
		if(a>b && a>c) {
			System.out.println(a);
		}
		else if(b>a && b>c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

	}


