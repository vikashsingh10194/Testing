package com.DataTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTestEx {
	
	@Test (dataProvider ="getData")
	
	public void setData( String username , String password)
	
	{
		
		System.out.println("your username is " + username);
		System.out.println(" your password is " + password);
		
	}
	
	@DataProvider()
	
	public Object[][] getData(){
		
		Object[][] data = new Object[3][2];
		
		data[0][0] ="sampleuser1";
		data[0][1] = "abcdef";

		
		data[1][0] ="testuser2";
		data[1][1] = "zxcvb";
		
		
		data[2][0] ="guestuser3";
		data[2][1] = "pass123";
		
		
		
		return data; 
		
		
	}
	
	
}
