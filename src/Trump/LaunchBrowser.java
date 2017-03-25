package Trump;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import uimap.SignUp; 

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	public WebDriver d ;
    @BeforeTest
	public void launching()
	{
          System.setProperty("webdriver.chrome.driver", "C:\\Praveen\\praveen\\SleniumDrivers\\chromedriver.exe");
		 d = new ChromeDriver();
		d.get("https://www.facebook.com");
		
	}
	@Test
    public void Testingtitle()
    {
    	String title = d.getTitle();
    	if(title.contains("facebook"))
    	{
    		System.out.println("passes");
    	}	
    	
    }
	@Test
	public void Usernamepassword()
	{
		//d.findElement("Signinpage.name").
		//SignUp sign = new SignUp(d) ;
		WebElement name=d.findElement(By.xpath("//input[@name='firstname']"));
		WebElement last=d.findElement(By.xpath("//input[@name='lastname']"));
		name.clear();
		name.sendKeys("praveen");
		last.sendKeys("kumar");
		
	}
	@Test
	public void Dob()
	{
		Select date = new Select(d.findElement(By.xpath("//*[@id='day']")));
		Select month = new Select(d.findElement(By.xpath("//*[@title='Month']")));
		Select year = new Select(d.findElement(By.xpath("//*[@title='Year']")));
		date.selectByIndex(7);
		month.selectByValue("5");
		year.selectByVisibleText("2011");
		List<WebElement>dates=date.getAllSelectedOptions();
		//Iterator a = new Iterator(dates);
		for (WebElement e : dates)
		{
			System.out.println("***********");
			System.out.println(e.getText());
			
		}
		//Select month = new Select(d.findElement(By.xpath("//*[@id='month']")));
		List<WebElement>months=month.getAllSelectedOptions();
		for (WebElement f : months)
		{
			System.out.println("***********");
			System.out.println(f.getText());
			
		}
		d.close();
		
	}
	
	
}
