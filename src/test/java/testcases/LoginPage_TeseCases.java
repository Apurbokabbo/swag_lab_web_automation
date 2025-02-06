package testcases;

import java.sql.Driver;

import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.BaseDriver;

public class LoginPage_TeseCases extends BaseDriver{
	
	
	LoginPage loginObj = new LoginPage() ;
	
	
	@Test
	public void loginScreenTittleVerify() throws InterruptedException{
		
		getDriver().get(loginObj.BASE_URL);
		Thread.sleep(5000);
		
	}

}
