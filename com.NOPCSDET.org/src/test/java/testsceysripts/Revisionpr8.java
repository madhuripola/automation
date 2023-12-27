package testsceysripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Revisionpr8 {
	public static void main(String[] args) throws Exception {
		// launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

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
		action.moveToElement(sbp).perform();
		action.click().perform();
		Thread.sleep(5000);
		action.moveToElement(sbp).perform();
		action.contextClick().perform();
		Thread.sleep(3000);
		driver.quit();

	}

}
