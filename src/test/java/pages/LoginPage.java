package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	
	
	
	public String LOGIN_PAGE_TITTLE_TEXT = "Swag Labs";
	public String LOGIN_PAGE_USER_NAME_INPUT_FIELD_PLACEHOLDER_TEXT = "Username";
	public String LOGIN_PAGE_PASSWORD_INPUT_FIELD_PLACEHOLDER_TEXT = "Username";
	public String a = "";
	
	public By b = By.id(""); 
	public By LOGIN_PAGE_TITTLE_LOCATOR = By.xpath("//div[contains(text(),'Swag Labs')]"); 
	public By LOGIN_PAGE_USER_NAME_INPUT_FIELD = By.xpath("//input[@id='user-name']"); 
	public By LOGIN_PAGE_PASSWORD_INPUT_FIELD = By.xpath("//input[@id='password']"); 
	public By LOGIN_BUTTON = By.xpath("//input[@id='login-button']"); 
	public By c = By.xpath(""); 
	
	
	

}
