package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws Exception {

		// Launch Chrome browser

		ChromeDriver driver = new ChromeDriver();

		// open nopcommerce login page

		driver.get("https://admin-demo.nopcommerce.com/login");

		// clear Email data from email field

		driver.findElement(By.name("Email")).clear();

		// Enter valid Email id

		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");

		// clear password from Pasword field

		driver.findElement(By.name("Password")).clear();

		// Enter valid Password
		driver.findElement(By.name("Password")).sendKeys("admin");

		// click on Login button
		driver.findElement(By.tagName("button")).click();

		Thread.sleep(6000);
		//Quit the entire opened browser
		driver.quit();
	}

}
