package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement srcBox=driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Java Tutorial");
		/*srcBox.sendKey8s(Keys.ENTER);
		String strTitle=driver.getTitle();
		System.out.println("Page Title.."+strTitle);
		System.out.println("Page URL..."+driver.getCurrentUrl());
		driver.navigate().back();*/
		Thread.sleep(2000);
		List<WebElement> items=driver.findElements(By.xpath("//ul[@class='G43f7e'][1]//li//descendant::div[@class='wM6W7d']"));
		System.out.println("No of items:"+items.size());
		for(int i=0;i< items.size();i++) {
			System.out.println(items.get(i).getText());
			System.out.println(items.get(i).getAttribute("role"));
			if(items.get(i).getText().equalsIgnoreCase("Java Tutorial PDF")) {
			items.get(i).click();
			items.get(i).submit();
			break;
		}
		
		
	}
	
	}

	}
