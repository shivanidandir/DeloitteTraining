import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selregx {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement we= driver.findElement(By.xpath("//*[@id='gbqfq']"));
		we.sendKeys("not able to see sponsored links on google search");
		driver.findElement(By.xpath("//*[@id='gbqfq']")).click();
		List<WebElement> allElements = driver.findElements(By.xpath("//h3/a"));
		for(WebElement element :allElements)
		{
			allElements.size();
			System.out.println(element.getText()); 
		}
		
		
	}
}
