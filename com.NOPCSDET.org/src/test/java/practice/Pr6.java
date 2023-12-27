package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr6 {

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
		boolean val = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed();
		if (val == true) {
			System.out.println("Login success");
		} else {
			System.out.println("Login failed");
		}
		driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[contains(text(),'Products')])[1]")).click();

		Thread.sleep(3000);
		boolean val1 = driver.findElement(By.xpath("(//input[@name='checkbox_products'])[1]")).isSelected();
		if (val1 == true) {
			System.out.println("checkbox already selected");

		}

		else {
			System.out.println("checkbox not selected");

			driver.findElement(By.xpath("(//input[@name='checkbox_products'])[1]")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//button[@id='delete-selected']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
			Thread.sleep(3000);
		}
		driver.quit();

	}

}
