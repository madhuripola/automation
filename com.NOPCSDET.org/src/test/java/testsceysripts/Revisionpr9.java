package testsceysripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revisionpr9 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		List<WebElement> a = driver.findElements(By.tagName("inpu"));
		int count = a.size();
		System.out.println(count);

		Thread.sleep(3000);
		driver.quit();

	}

}
