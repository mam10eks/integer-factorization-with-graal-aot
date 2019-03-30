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
}
