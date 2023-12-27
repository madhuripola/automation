package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr4 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);

		List<WebElement> allelts = driver.findElements(By.tagName("input"));
		System.out.println(allelts);
		int count = allelts.size();
		System.out.println(count);
		Thread.sleep(3000);
		driver.quit();

	}

}
