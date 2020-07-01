package com.testng.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//The order of execution is as given below. If any annotation is repeated in a class, the execution will happen in alphabetic order.

//@BeforeSuite 
//@BeforeTest
//@BeforeClass
//@BeforeMethod
//@Test
//@AfterMethod
//@AfterClass
//@AfterTest
//@AfterSuite

//Others:
//@Parameters()
//@DataProvider() - Write provider method under it. And mention it above the required @Test - 
// e.g. @Test(dataProvider = "provider method name or the name given against the @DataProvider(name="any name")")
//(groups = { "group name" }, dependsOnMethods = { "methodName" }), (enabled = true or false), (timeOut = in milliseconds)

public class Practice1_TestNG {
	
	@Test
	public void aaaaatestMethod() {
		
		System.out.println("\nThis is from aaaaatestMethod():");
		
	}
	
	@Test(groups = {"smoke"})
	public void helloMessage5() {
		
		System.out.println("\nhelloMessage5(): Hello Five!!");
		
		System.out.println("\n\nSome of the @Test methods in this class file has dependency on helloMessage5(): method. "
				+ "Hence this method will be the first to get executed, before any other @Test methods in this class. "
				+ "If there is any other method in this class with a dependency, then this or that method will be executed first based on the"
				+ " alphabetic order or if any set priority. "
				+ "If there is any other method, which comes in between based on the alphabetic order between this and that dependant method,"
				+ " then that normal method would be executed."
				+ " For eg. here helloMessage5() then sampleTimeOutMethod() and then comes testDependencyOptionTestNG1() \n\n");
		
	}
	
	@Test
	public void testDependencyOptionTestNG1() {
		
		System.out.println("\nThis is from testDependencyOptionTestNG1: To see how the order of execution of dependency methods.");
		
	}
	
	@Parameters("URL")
	@Test
	public void passingParameter(String url) {
		
		System.out.println("\nGet parameters in class Practice1_TestNG." + url);
		
	}
	
	@Test (dependsOnMethods = {"testDependencyOptionTestNG1", "helloMessage4"})
	public void dependentMethod1() {
		
		System.out.println("\ndependentMethod1(): depends on testDependencyOptionTestNG1().");
		
	}

	@Test(enabled = false)
	public void sampleDisabledMethod() {
		
		System.out.println("\n This is a disabled method!!");
		
	}

	@Test
	public void helloMessage7() {
		
		System.out.println("\nhelloMessage7(): Hello Seven!!");

	}

	@Test (timeOut = 40000)
	public void sampleTimeOutMethod() {
		
		System.out.println("\nsampleTimeOutMethod(): This is a method set with specific timeout of 40s!!");
		
	}

	@AfterSuite
	public void sampelAfterSuite() {
		
		System.out.println("\n@AfterSuite: Practice1_TestNG-sampelAfterSuite(): After executing all methods in this Suite."
				+ " If there is more than one, it will be executed in alphabetic order.");
		
	}

	@BeforeMethod
	public void sampleBeforeMethod() {
		
		System.out.println(
				"\nsampleBeforeMethod(): @BeforeMethod: Executes each time before executing every method in this class. Hello Everyone!!");
		
	}

	@Test(dependsOnMethods = { "helloMessage5", "helloMessage4" })
	public void aaaHelloMessage2() {
		
		System.out.println(
				"\naaaHelloMessage2(): Hello Two!! dependsOnMethods = {\"helloMessage5\", \"helloMessage4\"}. "
				+ "This is causing this method to execute as last @Test!!");

	}

	@AfterMethod
	public void sampleAfterMethod() {
		
		System.out.println(
				"\n@AfterMethod: Practice1_TestNG-sampleAfterMethod(): Executes every time after executing the methods in this class. Hello class.");

	}

	@BeforeSuite
	public void helloMessage1() {
		
		System.out.println(
				"\n@BeforeSuite: Practice1_TestNG-helloMessage1(): This method will be executed before executing any method"
				+ " in any of the classes in this TestSuite. Hello Three!!");

	}

	@Test(groups = { "smoke", "regression7" }, dependsOnMethods = { "helloMessage5" })
	public void helloMessage4() {
		
		System.out.println("\nhelloMessage4(): Hello Four!!");
		
	}

	@Test(groups = { "smoke" })
	public void helloMessage6() {
		
		System.out.println("\nhelloMessage6(): Hello Six!!");

	}

	@BeforeClass(groups = { "smoke" })	
	public void beforeClassSample() {
		
		System.out.println("\n***********************************************************************************************");
		
		System.out.println(
				"\n@BeforeClass: Practice1_TestNG - beforeClassSample(): Should be executed before any methods in this class, and after the @BeforeTest.");
		
	}

	@AfterClass(groups = { "smoke" })	
	public void afterClassSample() {
		
		System.out.println("\n***********************************************************************************************");
		
		System.out.println(
				"\n@AfterClass: Practice1_TestNG-afterClassSample(): Should be executed after completing all methods in this class, and before the @AfterTest.");
		
	}

	@BeforeTest
	public void helloFirstMessageInThisClass() {
		
		System.out.println(
				"\n@BeforeTest: Practice1_TestNG-helloFirstMessageInThisClass(): Executes before executing any @BeforeClass or @BeforeMethod or @Test methods in any of the classes in this package. Hello !!");
	
	}

	@AfterTest
	public void helloLastMessageInThisClass() {
		
		System.out.println(
				"\n@AfterTest: Practice1_TestNG-helloLastMessageInThisClass(): Executes after executing all @Test or @AfterMethod or @AfterClass in all the classes in this Package. After this @AfterSuite will be executed, if no other @AfterTest.");
		
	}

}
