package javaprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forloop  {

	public static void main(String[] args)throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.name("Email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.name("Password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("admin");
		Thread.sleep(2000);
		for(int i=1;i<=5;i++) {
		driver.findElement(By.tagName("button")).click();;
		
			Thread.sleep(5000);
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			System.out.println(i+   "    login is successful");
		}
		
		driver.quit();
		
		

	}

}
