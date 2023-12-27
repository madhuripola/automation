package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr2 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='Email']"));
		ele1.clear();
		Thread.sleep(3000);
		ele1.sendKeys("admin@yourstore.com");

		WebElement ele2 = driver.findElement(By.xpath("//input[@name='Password']"));

		ele2.clear();
		Thread.sleep(3000);
		ele2.sendKeys("admin");

		WebElement btn = driver.findElement(By.xpath("//button[text()='Log in']"));
		btn.click();
		Thread.sleep(3000);
		driver.quit();

	}

}
