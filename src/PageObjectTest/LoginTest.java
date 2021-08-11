package PageObjectTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.RediffHomePage;
import PageObject.RediffLoginPage;
import PageObject.RediffLoginPagePF;

public class LoginTest {
	
	WebDriver driver;
	@BeforeTest
	public void redifflogin()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi?mobilelogin=1");
	}
	@Test(priority=0)
	public void emailLogin()
	{
		RediffLoginPagePF rd=new RediffLoginPagePF(driver);
		rd.email().sendKeys("swathi");
		rd.pwd().sendKeys("vidiyala");
		rd.sign().click();
		rd.Home().click();
		/*RediffHomePage rh=new RediffHomePage(driver);
		rh.Search().sendKeys("shoes");
		rh.Submit().click();*/
		
	}
	@Test(priority=1)
	public void Home() throws InterruptedException
	{
		//Thread.sleep(3000);
		RediffHomePage rh=new RediffHomePage(driver);
		rh.Search().sendKeys("shoes");
		rh.Submit().click();
	}
	@AfterTest
	public void suspend()
	{
		driver.quit();
	}
}
