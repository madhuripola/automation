package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pr14 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.name("Password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(3000);
		WebElement sbp = driver.findElement(By.xpath("//a[@id='nopSideBarPusher']"));
		Actions action = new Actions(driver);
		action.moveToElement(sbp).perform();
		Thread.sleep(3000);
		action.click().perform();
		Thread.sleep(3000);
		action.moveToElement(sbp).perform();
		Thread.sleep(3000);
		action.contextClick().perform();
		Thread.sleep(3000);
		driver.quit();

	}

}