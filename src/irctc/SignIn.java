package irctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignIn {
	

	public WebDriver dr ;
    @BeforeTest
	public void launching()
	{
          System.setProperty("webdriver.chrome.driver", "C:\\Praveen\\praveen\\SleniumDrivers\\chromedriver.exe");
		 dr = new ChromeDriver();
		dr.get("https://www.irctc.co.in");
		
	}
    @Test
    public void Accomodations()
    {
    	Actions action = new Actions(dr) ;
    	WebElement e = dr.findElement(By.xpath("//a[contains(text(), 'Accommodations')]"));
    	action.moveToElement(e).build().perform();
    	dr.findElement(By.linkText("Hotels & Lounge")).click();
    	System.out.println(dr.getTitle());
    	dr.findElement(By.xpath("//*[@href='javascript:doNothing()']")).click();
    	dr.findElement(By.xpath("//div[@class='calClose']/table[2]/tbody/tr[3]/td[4]")).click();
    	System.out.println("fsfdsfdf");
    	
    	
    	
    	
    }
    @AfterTest
    public void logout()
    {
    	dr.close();
    }

}
