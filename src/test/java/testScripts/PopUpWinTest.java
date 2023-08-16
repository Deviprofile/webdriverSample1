package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWinTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWin=driver.getWindowHandle();
		System.out.println("Parent Window..."+parentWin);
		driver.findElement(By.xpath("//button[contains(text(),' new Tab ')]"));
		Set<String> wins =driver.getWindowHandles();
		System.out.println("No of Windows..."+wins.size());
		for(String tab :wins) {
			System.out.println(tab);
			if(!tab.equalsIgnoreCase(parentWin)) {
				driver.findElement(By.xpath("(//span[contains(text(),'Java')])[1]"));
			
			}
		}
		driver.close();
		driver.switchTo().window(parentWin);
		driver.findElement(By.xpath("//button[contains(text(),' new Window')]"));
		//driver.close();
		//driver.quit();
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.seleniumdev/blog/");
		driver.quit();
	}

}
