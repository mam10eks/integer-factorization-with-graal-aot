package com.empty_stack.ifwga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntegerFactorizationUtil
{

	public static List<Integer> factorize(int i)
	{
		if(isPrimNumber(i))
		{
			return Arrays.asList(i);
		}
		else if(i > 4)
		{
			List<Integer> ret = new ArrayList<>(Arrays.asList(2));
			ret.addAll(factorize(4));
			
			return ret;
		}
		
		return Arrays.asList(2,2);
	}
	
	private static boolean isPrimNumber(int number)
	{
		return number > 1 
			&& IntStream.range(2, number).noneMatch(i -> (number%i) == 0);
	}
}
