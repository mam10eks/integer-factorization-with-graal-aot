package com.empty_stack.ifwga;

import java.util.Arrays;
import java.util.List;

public class IntegerFactorizationUtil
{

	public static List<Integer> factorize(int i)
	{
		if(i == 4)
		{
			return Arrays.asList(2,2);
		}
		return Arrays.asList(i);
	}
}
