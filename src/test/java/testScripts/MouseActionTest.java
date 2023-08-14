package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionTest {

	public static void main(String[] args)  {
			WebDriver driver=new ChromeDriver();
			Actions actions=new Actions(driver);
			driver.manage().window().maximize();
			driver.get("https://demo.opencart.com/");
		
			

	}

}
