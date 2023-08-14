package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chkboxRadioTest {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement chkBox=driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]"));
if(!chkBox.isSelected()) {
	chkBox.click();
}
	
	
	}
}
