package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr1 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.name("Password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.tagName("button")).click();

		Thread.sleep(3000);
		String attr = driver.findElement(By.tagName("button")).getAttribute("tagName");
		System.out.println(attr);
		String tagna = driver.findElement(By.tagName("button")).getTagName();
		System.out.println(tagna);
		
		driver.quit();
	}
}
