import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class SeleniumWebDriver {

	private static String fileWithPath;
	
	public static void main(String[] args) throws InterruptedException,IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//DesiredCapabilities capabilities= DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true);
		WebDriver driver= new ChromeDriver();
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(src, new File("C:/selenium/error.png"));
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		//driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/?gclid=CjwKCAiApOvwBRBUEiwAcZGdGHQG81a1NDN73R6wQr94vxClRd5YTSMaMmt6P-yV8VJfbjy6UnG91RoC0uMQAvD_BwE&utm_source=google&utm_medium=cpc&utm_campaign=&utm_term=myntra&utm_content=&matchtype=e");
		//driver.findElement(By.name("email")).sendKeys("Hello");
		
//		driver.get("https://www.myntra.com/shoe");
//		driver.manage().window().maximize();
		//driver.findElement(By.className("common-checkboxIndicator")).click();
//		WebElement chkbox=driver.findElement(By.name("Earings"));
//		WebElement chkbox=driver.findElement(By.xpath("/html/body/div[2]/div/main/div[3]/div[1]/section/div/div[2]/ul/li[1]/label/text()"));
//		
//		chkbox.click();
//		if(chkbox.isSelected())
//		{
//			System.out.println("Check is on");
//			
//		}
//		
//		driver.get("https://www.myntra.com/shoe");
//		driver.findElement(By.className("sort-sortBy")).click();
//		driver.findElement(By.className("sort-label")).click();
//		Select sel=new Select(driver.findElement(By.id("new")));
//		sel.selectByVisibleText("What's New");
//		if(radio.isSelected())
//		{
//			System.out.println("Check is on");
//		}
				
		
		
		
	}
}
