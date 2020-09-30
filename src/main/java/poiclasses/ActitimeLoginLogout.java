package poiclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginLogout
{
public WebDriver driver;    //declared globally
	
	@FindBy(id="username")
	private WebElement usernameTextField;

	@FindBy(xpath = "//input[@name='pwd']")
	private  WebElement passwordTextField;

	@FindBy(xpath = "//div[.='Login ']")
	private WebElement loginButtonField;

	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logoutButtonField;

	public ActitimeLoginLogout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void loginMethod()
	{
		usernameTextField.sendKeys("admin");
		passwordTextField.sendKeys("manager");
		loginButtonField.click();
	}
	public void logoutButtonField()
	{
		logoutButtonField.click();
	}

}
