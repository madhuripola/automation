package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {
	
	public static void main(String[] args)throws Exception{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(10000);
		driver.quit();
	}
		
			
}
