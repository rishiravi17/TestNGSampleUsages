package com.testng.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Practice3_TestNG {
	
	@BeforeClass
	public void methodBeforeClass() {
		System.out.println("\n***********************************************************************************************");
	}
	
	@AfterClass
	public void methodAfterClass() {
		System.out.println("\n***********************************************************************************************");
	}
	
	@Test
	public static void howdyMethod1() {
		System.out.println("\n Practice 3_TestNG Class. Only @Test method. howdy1.... Cool.. Doing good!!");
		
	}
	
	@Test(groups = {"smoke"})
	public static void howdyMethod2() {
		System.out.println("\n Practice 3_TestNG Class. Only @Test method. howdy2.... Cool.. Doing good!!");
		
	}
	
	@Test
	public static void howdyMethod3() {
		System.out.println("\n Practice 3_TestNG Class. Only @Test method. howdy3.... Cool.. Doing good!!");
		
	}

}
