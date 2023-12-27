package testsceysripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revisionpr10 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement a = driver.findElement(By.tagName("inpu"));
		System.out.println(a);
		Thread.sleep(3000);
		driver.quit();

	}

}
