package generic;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import io.github.bonigarcia.wdm.WebDriverManager;
import poiclasses.ActitimeLoginLogout;

public class Basicsclass 
{
	public WebDriver driver;
	@BeforeClass
	public void openbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}	
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}

	@BeforeMethod

	public void LoginToApp()
	{
		ActitimeLoginLogout login=new ActitimeLoginLogout(driver);
		login.loginMethod();
	}

	@AfterMethod
	public void LogoutFromApp()
	{
		ActitimeLoginLogout login=new ActitimeLoginLogout(driver);
		login.logoutButtonField();
	}

	@BeforeSuite
	public void beforeExecution()
	{
		Reporter.log("Execution Started",true);  //if we give "true" then it will display output if we give"false" it wont give output which we give
	}

	@AfterSuite
	public void afterExecution()
	{
		Reporter.log("Execution Completed successfully", true);
	}


}


