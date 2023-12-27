package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncn {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));

		driver.findElement(By.name("Email")).clear();

		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");

		driver.findElement(By.name("Password")).clear();

		driver.findElement(By.name("Password")).sendKeys("admin");

		driver.findElement(By.tagName("button")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("nopSideBarPusher"))));
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