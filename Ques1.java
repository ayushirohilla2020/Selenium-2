
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/ayushi/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	    driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	    Thread.sleep(2000); 
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("TO THE NEW");
        driver.switchTo().alert().accept();
	}
}