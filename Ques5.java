

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ayushi/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		System.out.println(driver.findElements(By.tagName("iframe")).size());

	}

}
