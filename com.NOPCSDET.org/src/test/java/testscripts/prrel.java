package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class prrel {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));

		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(2000);
		WebElement pws = driver.findElement(By.id("Password"));
		pws.clear();
		Thread.sleep(2000);
		pws.sendKeys("admin");
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(pws)).click();

		Thread.sleep(2000);
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(pws)).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("nopSideBarPusher"))));
		WebElement sbp = driver.findElement(By.id("nopSideBarPusher"));
		Actions action = new Actions(driver);
		action.moveToElement(sbp).click().perform();
		action.moveToElement(sbp).perform();
		action.contextClick().perform();
		Thread.sleep(3000);

	}
}