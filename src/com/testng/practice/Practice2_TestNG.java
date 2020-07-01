package com.testng.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice2_TestNG {
	
	@Parameters({ "URL", "CRED" })
	@Test
	public void goodBye1(String url, String cred) {
		
		System.out.println("\ngoodBye1(with parameters) Good bye One!");
		
		System.out.println("\nThe site is: " + url + ". The user name is: " + cred);

	}

	@BeforeTest
	public void beforeTestSample() {
		System.out.println(
				"\n@BeforeTest: Practice2_TestNG: This will be executed before executing any @Test or @Before methods in any of the classes in this pacakge. "
						+ "If there is more than one @BeforeTest, it executed in aplhabetical order. Good bye One!");

	}	

	@Test(groups = { "smoke" })
	public static void goodBye3() {
		System.out.println("\n Good bye Three!");

	}

	@AfterSuite
	public void goodBye4() {
		System.out.println(
				"\n @AfterSuite: Practice2_TestNG: This method will be executed after executing all methods in all the classes in this Suite. Good bye Four!");

	}

	@Test
	public void welcomeMessage1() {
		System.out.println(
				"\n This will never print: welcome.* excluded. This is a message to exclude using Reg Expression in TestNG.");

	}

	@AfterMethod
	public void sampleAfterMethod() {
		System.out.println(
				"\n @AfterMethod: Practice2_TestNG: This is a method executes each time after executing every method in this class. Goodbye!!");

	}

	@AfterTest
	public void afterTestMessage() {
		System.out.println(
				"\n @AfterTest: Practice2_TestNG. This should run after executing all @Test methods in all classes. GoodBye!!");

	}

	@Test
	public void welcomeMessage2() {
		System.out.println(
				"\n This will never print: welcome.* exlcuded. This is a message to exclude using Reg Expression in TestNG.");

	}

	@BeforeClass
	public void beforeClassGoogbye() {
		System.out.println(
				"\n***********************************************************************************************");
		System.out.println(
				"\n @BeforeClass: Practice2_TestNG: This will be executed first before any methods in this class - Good bye.");

	}

	@AfterClass
	public void afterClassGoodBye() {
		System.out.println(
				"\n***********************************************************************************************");
		System.out.println(
				"\n @AfterClass: Practice2_TestNG: This will be executed at the end of executing all methods in this class - Good bye.");

	}
	
	// @Parameters({ "URL" }) Parameterizing is possible either by data provider or by parameters in TestNG XML.
	// @Test(dataProvider = "LoginUserDetails")
	@Test(dataProvider = "LoginUserDetails")
	public void goodBye2(String usrName, String pwd) {
			
		System.out.println("\n Good bye Two!");
			
		//System.out.println("\n The site is: " + url);
			
		System.out.println("The user name and password is: " + usrName + " " + pwd);

	}
	
	@Test (dataProvider = "getUserCredentialsAndPIN")
	public void loginTestMethod(String username, String password, String pin) {
		
		System.out.println("\nThis is from loginTestMethod(): " + username + ", " + password + ", & " + pin);
		
	}

	@DataProvider (name="LoginUserDetails")
	public Object[][] getUserCredentials() {
		
		// I have 3 types of user credentials - Enabled User, Disabled User and Locked
		// Out user.
		// Each credential has a UserName and Password. Since there are 3 users and 2 credentials, 3 x 2 array is required.
		
		Object[][] dataCredentials = new Object[3][2];

		dataCredentials[0][0] = "username1";
		dataCredentials[0][1] = "password1";

		dataCredentials[1][0] = "username2";
		dataCredentials[1][1] = "password2";

		dataCredentials[2][0] = "username3";
		dataCredentials[2][1] = "password3";

		return dataCredentials;

	}
	
	@DataProvider
	public String[][] getUserCredentialsAndPIN() {
		
		String[][] credentials = new String[3][3];
		
		credentials[0][0] = "login1";
		credentials[0][1] = "password1";
		credentials[0][2] = "pin1";
		
		credentials[1][0] = "login2";
		credentials[1][1] = "password2";
		credentials[1][2] = "pin2";
		
		credentials[2][0] = "login3";
		credentials[2][1] = "password3";
		credentials[2][2] = "pin3";
		
		return credentials;
		
	}

}
