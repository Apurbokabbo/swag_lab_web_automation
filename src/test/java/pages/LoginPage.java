package pages;

import org.openqa.selenium.By;


public class LoginPage extends BasePage{
	
	
	
	public String LOGIN_PAGE_TITTLE_TEXT = " Swag Labs";
	public String LOGIN_PAGE_USER_NAME_INPUT_FIELD_PLACEHOLDER_TEXT = "Username";
	public String LOGIN_PAGE_PASSWORD_INPUT_FIELD_PLACEHOLDER_TEXT = "Password";
	public String PASSWORD = "secret_sauce";
	public String a = "";

	
//	public By b = By.id(""); 
	public By LOGIN_PAGE_TITTLE_LOCATOR = By.xpath("//div[contains(text(),'Swag Labs')]"); 
	public By HOME_PAGE_TITTLE_LOCATOR = By.xpath("//div[@id='']"); 
	public By LOGIN_PAGE_USER_NAME_INPUT_FIELD = By.xpath("//input[@id='user-name']"); 
	public By LOGIN_PAGE_PASSWORD_INPUT_FIELD = By.xpath("//input[@id='password']"); 
	public By LOGIN_BUTTON = By.xpath("//input[@id='login-button']"); 
	public By PASSWORD_FOR_ALL_USERS_LOCATOR = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]"); 
	public By ACCEPTED_USER_NAMES = By.xpath("//div[@id='login_credentials']"); 
	public By ERROR_MESSAGE_LOCATOR = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]"); 
//	public By c = By.xpath(""); 
	
	
	
	public void loginner(String userName , String password) throws InterruptedException {
		
		Thread.sleep(500);
		findElement(LOGIN_PAGE_USER_NAME_INPUT_FIELD).sendKeys(userName);
		findElement(LOGIN_PAGE_PASSWORD_INPUT_FIELD).sendKeys(password);
		findElement(LOGIN_BUTTON).click();
		waitForElementVisible(LOGIN_PAGE_TITTLE_LOCATOR, 1000);
//		verifyPageTitle(LOGIN_PAGE_TITTLE_TEXT);
		
		
		
		
	}
	
	
	

}
