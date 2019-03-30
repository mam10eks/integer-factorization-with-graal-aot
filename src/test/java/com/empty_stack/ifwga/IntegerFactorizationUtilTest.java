package com.empty_stack.ifwga;

import org.junit.Assert;
import org.junit.Test;

public class IntegerFactorizationUtilTest
{
	@Test
	public void checkThatFactorizationOf2Returns2()
	{
		int expected = 2;
		int actual = IntegerFactorizationUtil.factorize(2);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void checkThatFactorizationOf5Returns5()
	{
		int expected = 5;
		int actual = IntegerFactorizationUtil.factorize(5);

		Assert.assertEquals(expected, actual);
	}
}
