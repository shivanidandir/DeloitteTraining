import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadriven {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fi = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\test.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			XSSFSheet sh = wb.getSheetAt(0);
			@SuppressWarnings("rawtypes")
			Row r = sh.getRow(0);
			Cell c = r.getCell(0);
			System.out.println(c);
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			// driver.get(c.toString());
			// driver.findElement(By.name("email")).sendKeys("Hello");
			// fi.close();
			// Cell cell = r.createCell(1);

			// WebElement w=driver.findElement(By.id("banner_cta_button"));
			// String extracted = w.getText();
			// System.out.println(extracted);
			// cell.setCellValue(extracted);
			// FileOutputStream fos = new
			// FileOutputStream("C:\\Users\\ADMIN\\Desktop\\test.xlsx");
			// wb.write(fos);
			// fos.close();

			driver.get("https://www.indiatoday.in/");
			// driver.switchTo().alert().dismiss();
			// driver.switchTo().alert().accept();
			// driver.switchTo().alert().getText();
			// driver.switchTo().alert().sendKeys("text");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
