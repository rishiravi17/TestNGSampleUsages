package utils.dataprovider;

import org.testng.annotations.DataProvider;

public class GetDataFromDataProvider {
	
	@DataProvider(name="testCredentials")
	public String[][] getUserLoginCredentials() {
		
		String[][] userDetails = new String[3][3];
		
		userDetails[0][0] = "user1";
		userDetails[0][1] = "test1#";
		userDetails[0][2] = "7777";
		
		userDetails[1][0] = "user2";
		userDetails[1][1] = "test2#";
		userDetails[1][2] = "4444";
		
		userDetails[2][0] = "user3";
		userDetails[2][1] = "test3#";
		userDetails[2][2] = "3333";
		
		return userDetails;	
		
		
	}

}
