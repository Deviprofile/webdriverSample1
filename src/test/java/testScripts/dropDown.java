package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

		public static void main(String[] args)  {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
			Select Sigsel=new Select(driver.findElement(By.id("select-demo")));
			Sigsel.selectByIndex(1);
			Select mulsel=new Select(driver.findElement(By.id("multi-select")));
			mulsel.selectByIndex(1);
			mulsel.selectByValue("New Jersey");
					
			mulsel.selectByVisibleText("Florida");
			List<WebElement> items=mulsel.getAllSelectedOptions();
			
	}

}
