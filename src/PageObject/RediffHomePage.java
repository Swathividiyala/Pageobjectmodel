package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	
WebDriver driver;
	
	public RediffHomePage(WebDriver driver) {
		
		this.driver=driver;
		
	}


	
	By serach=By.xpath("//input[@class='homesrchbox']");
	By submit=By.className("newsrchbtn");
	
	public WebElement Search()
	{
		return driver.findElement(serach);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(submit);
	}
	
	
	
	
	
	
	
}
