package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	
		String strLb1=driver.findElement(By.xpath("//label/span")).getText();
		System.out.println(strLb1);
		//switch to frame1
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Welcome");
		//swithch to frame3
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a"));
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(" Welcome Bak");
		driver.switchTo().defaultContent();
		String strLb2=driver.findElement(By.xpath("//label/span")).getText();
		System.out.println(strLb2);
		
	}

}
