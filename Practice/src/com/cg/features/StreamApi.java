package com.cg.features;

import java.util.Arrays;
import java.util.List;

public class StreamApi {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5,1,6,3,4);
		
		int result=nums.stream()
		.filter(n-> n%2==1)
		.sorted()
		.map(n ->n*2)
		.reduce(0,(c,e)->c+e);
		
		System.out.println(result);
		
		
		
		/*Stream<Integer> data = nums.stream();
		// we can use one stream only once.
		Stream<Integer> sortedData = data.sorted(); 
		
		sortedData.forEach(n -> System.out.println(n));*/
		
		
	}

}
