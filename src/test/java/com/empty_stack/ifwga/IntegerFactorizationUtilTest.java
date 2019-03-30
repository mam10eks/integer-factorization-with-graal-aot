package com.empty_stack.ifwga;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IntegerFactorizationUtilTest
{
	@Test
	public void checkThatFactorizationOf2Returns2()
	{
		List<Integer> expected = Arrays.asList(2);
		List<Integer> actual = IntegerFactorizationUtil.factorize(2);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void checkThatFactorizarionof4Returns2_2()
	{
		List<Integer> expected = Arrays.asList(2, 2);
		List<Integer> actual = IntegerFactorizationUtil.factorize(4);

		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void checkThatFactorizarionof4Returns2_2_2()
	{
		List<Integer> expected = Arrays.asList(2, 2, 2);
		List<Integer> actual = IntegerFactorizationUtil.factorize(8);

		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void checkThatFactorizationOf5Returns5()
	{
		List<Integer> expected = Arrays.asList(5);
		List<Integer> actual = IntegerFactorizationUtil.factorize(5);

		Assert.assertEquals(expected, actual);
	}
}
