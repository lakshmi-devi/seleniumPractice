import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;


public class Login {
	
	@Test
	public void loginPage() throws IOException {
		
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	driver.findElement(By.xpath("//tr//child::td//strong[text()='Algeria']//parent::td//preceding-sibling::td//input")).click();
//	driver.findElement(By.id("username")).sendKeys("tomsmith");
//	driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	driver.getTitle().compareToIgnoreCase("The Internet");
//	String expected = "Secure Area";
//	String actual = driver.findElement(By.xpath("//h2[normalize-space()='Secure Area']")).getText();
//    Assert.assertEquals(expected, actual);
//    TakesScreenshot screenshot =  (TakesScreenshot) driver;
//   String dateTime = new SimpleDateFormat("yyyyddMM hhmmss").format(new Date());
//   String fileName = "img" + dateTime + ".png";
//    File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
//    FileUtils.copyFile(srcFile, new File("C:\\Users\\ACCESS\\Desktop\\screenshot\\"+fileName));
	driver.close();
}
}
