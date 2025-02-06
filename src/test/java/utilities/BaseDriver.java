package utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseDriver {
	
	private static String browserName = System.getProperty("browser", "firefox");
	private static final ThreadLocal<WebDriver> lOCAL_DRIVER = new ThreadLocal<WebDriver>();
	
	public static void setDriver(WebDriver driver)
	{
		BaseDriver.lOCAL_DRIVER.set(driver);
	}
	
	
	
	public static WebDriver getDriver()
	{	
		return lOCAL_DRIVER.get();
	}
	
	
	public static WebDriver getBrowser (String browserName) {
		
		switch (browserName.toLowerCase()) 
		{
		case "chorom":
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
			
		case "firefox" :
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
			
		case "edge" :
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
		
		default:
			throw new RuntimeException("Browser not Found!!! Using given name: " + browserName);
			
		}
		
		
	}
	
	@BeforeMethod
	public static synchronized void setBrowser()
	{
		WebDriver driver = getBrowser(browserName);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		setDriver(driver);
		
	}
	
	@AfterMethod
	public static synchronized void closeBrowser() {
		
		getDriver().quit();
		
	}


	
	

}
