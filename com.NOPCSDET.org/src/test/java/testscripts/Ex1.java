package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {
	public static void main(String[] args)throws Exception{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/login");
	driver.findElement(By.name("Email")).clear();
	driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
	driver.findElement(By.name("Password")).clear();
	driver.findElement(By.name("Password")).sendKeys("admin");
	driver.findElement(By.tagName("button")).click();
	Thread.sleep(10000);
	driver.quit();
	
	
		
		

	}

}
