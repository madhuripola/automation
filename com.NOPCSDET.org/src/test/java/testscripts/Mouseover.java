package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
	public static void main(String[] args) throws Exception {

		// launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();

		// open NC login page
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		// Do login
		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");

		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");

		driver.findElement(By.xpath("//*[text()='Log in']")).click();

		Thread.sleep(7000);
		WebElement sbp = driver.findElement(By.id("nopSideBarPusher"));

		Actions action = new Actions(driver);
		action.moveToElement(sbp).click().perform();
		Thread.sleep(7000);
		action.moveToElement(sbp).perform();
		Thread.sleep(3000);
		action.contextClick().perform();
		Thread.sleep(7000);
		driver.quit();

	}
}