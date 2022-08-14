package com.tns.string;
import java.util.StringTokenizer;

public class StringTokenizerExample {


	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Lets try this");
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());

	}

}
