package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex13 {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		String mad = driver.findElement(By.name("Email")).getAttribute("id");
		System.out.println("Email values:" + mad);

		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(3000);
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.tagName("button")).click();
		String mad1 = driver.findElement(By.tagName("button")).getText();
		System.out.println(mad1);
		Thread.sleep(10000);

	}

}
