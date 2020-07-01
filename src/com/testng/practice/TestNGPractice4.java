package com.testng.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGPractice4 {
	
	@Parameters({ "URL" })
	@Test
	public void abcTestMethod(String myURL) {
		System.out.println("\n ********************* Starting TestNGPractice4 Methods ******************** ");
		System.out.println("\n Practice4_TestNG: This is from abcTestMethod");
		System.out.println("\n abcTestMethod site is: " + myURL);
	}

	/*@BeforeTest
	public void abcBeforeTestMethod(String myURL) {
		System.out.println("\n Practice4_TestNG: This is from abcBeforeTestMethod");
		System.out.println("\n The site is: " + myURL);
	}

	@AfterTest
	public void abcAfterTestMethod(String myURL) {
		System.out.println("\n Practice4_TestNG: This is from abcAfterTestMethod");
		System.out.println("\n The site is: " + myURL);
	}*/


	@Test
	public void goodByeTest() {
		System.out.println("\n Practice4_testNG! @Test");
		System.out.println("Practice4_testNG: @Test goodByeTest");
		System.out.println("\n ********************* End of TestNGPractice4 Methods ********************\n");

	}

}
