package testsceysripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Revisionpr17 {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));

		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");

		WebElement pws = driver.findElement(By.id("Password"));

		pws.clear();

		pws.sendKeys("admin");

	driver.findElement(RelativeLocator.with(By.tagName("input")).below(pws)).click();

		driver.findElement(RelativeLocator.with(By.tagName("button")).below(pws)).click();

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("nopSideBarPusher"))));
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
