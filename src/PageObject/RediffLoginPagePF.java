package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {
	
	WebDriver driver;
	
	
	
	public RediffLoginPagePF(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	
	/*By username=By.xpath("//input[@id='login1']");
	By password=By.name("passwd");
	By signin=By.name("proceed");
	By home=By.linkText("rediff.com");*/
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement signin;
	
	@FindBy(linkText="rediff.com")
	WebElement home;
	
	
	
	public WebElement email()
	{
		return username;
	}
	
	public WebElement pwd()
	{
		return password;
	}
	
	public WebElement sign()
	{
		return signin;
	}
	public WebElement Home()
	{
		return home;
		
	}

}
