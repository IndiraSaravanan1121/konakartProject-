package com.Konakart.Helper;

import org.testng.Assert;

public class Assertion {

	public static void assertEquals(String actual, String expected) {
		Assert.assertEquals(actual, expected);
		System.out.println("Matched....");

	}

}
