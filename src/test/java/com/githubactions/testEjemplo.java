package com.githubactions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testEjemplo {
	@Test
	public void testExample() {
		System.out.println("El test funciona??");
		Assert.assertEquals(1, 1);
	}

}
