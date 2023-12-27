package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex15 {
	public static void main(String[] args) throws Exception {
		// Launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// open NC login page
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		// Do login
		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(7000);
		// verify login success
		boolean val = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed();

		if (val == true) {
			System.out.println("Login success");
		} else {
			System.out.println("Login failed");

		}
		// click on catalog
		driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();
		Thread.sleep(3000);
		// click on products
		driver.findElement(By.xpath("(//p[contains(text(),'Products')])[1]")).click();
		Thread.sleep(3000);
		// select check box
		boolean val1 = driver.findElement(By.xpath("(//input[@name='checkbox_products'])[1]")).isSelected();
		if (val1 == true) {
			System.out.println("check box already got selected");
		} else {
			System.out.println("check box not yet selected");
		}
		driver.findElement(By.xpath("(//input[@name='checkbox_products'])[1]")).click();
		Thread.sleep(3000);
		// delete selected product
		driver.findElement(By.xpath("//button[@id='delete-selected']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(4000);
		driver.quit();

	}
}
