package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement srcBox=driver.findElement(By.id("APjFb"));
		srcBox.sendKeys("Java Tutorial");
		srcBox.sendKeys(Keys.ENTER);
		String strTitle=driver.getTitle();
		System.out.println("Page Title.."+strTitle);
		System.out.println("Page URL..."+driver.getCurrentUrl());
		driver.navigate().back();
		
		
	}
	
	

}
