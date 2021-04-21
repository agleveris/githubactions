package com.githubactions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testEjemplo {
	@Test
	public void testExample() {
		System.out.println("mi test funciona??");
		Assert.assertEquals(1, 1);
	}

}
