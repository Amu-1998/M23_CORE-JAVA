package com.cg.ArrayAndCollectionClass;

import java.util.Arrays;

public class LearnArrayClass {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6,7,8,9};
		int index = Arrays.binarySearch(numbers, 4);//it will only work if the array is sorted and give the index
		System.out.println(index);
		
		Integer[] number = {10,2,13,42,1,33,3,12};
		Arrays.sort(number);//it will sort the array
		
		Arrays.fill(number, 3);//when you want to fill the array by any single no
		
		for(int i: number)
		{
			System.out.print(i+ " ");
		}
		
	}

}
