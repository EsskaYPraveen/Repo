package uimap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {
        WebDriver d ;
	public SignUp(WebDriver d)
	{
		By name = By.xpath("//input[@name='firstname']");
		By password = By.xpath("//input[@name='lastname']");
		this.d= d ;
	}

}
