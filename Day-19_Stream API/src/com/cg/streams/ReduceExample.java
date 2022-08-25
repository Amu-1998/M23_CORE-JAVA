package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample
{
	List<Integer>obj= Arrays.asList(5,11,6,44,2,553,23,53);
	Optional<Integer>result=obj.stream().reduce((i,j)->i>j?i:j);{
	if(result.isPresent())
	{
		System.out.print("Result is: "+result.get());
	}

									}
}
