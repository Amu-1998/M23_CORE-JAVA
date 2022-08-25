package com.cg.lambdaexpr;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	public static void main(String[] args) {
		//lambda expression for searching a file in given path of particular extension
		FileFilter filter=(File pathname)->pathname.getName().endsWith(".pdf");
		File dir = new File("C:\\Users\\RITIKA\\Downloads ");
		File contents[]=dir.listFiles(filter);
		//enhanced for loop
		//if any particular extension file is open on your system then you will get that file two times with $sign
		
		for(File i:contents)
		{
			System.out.println(i);
		}

	}

}
