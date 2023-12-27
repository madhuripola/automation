package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example6 {
	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=List<A>dmin%2F");
		Thread.sleep(7000);
		List<WebElement> allInputs = driver.findElements(By.tagName("span"));

		System.out.println(allInputs);
		Thread.sleep(3000);
		driver.quit();

	}
}