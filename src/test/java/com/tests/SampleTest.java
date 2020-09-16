package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jbk.Sample;

public class SampleTest {
	Sample samp = new Sample();

	@Test
	public void test01()
	{
		int result = samp.addition(2,3);
		Assert.assertEquals(result,5);
	}
	
	@Test
	public void test02()
	{
		int result =samp.subtraction(5,3);
		Assert.assertEquals(result,2);
	}
}
