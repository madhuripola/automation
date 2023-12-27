package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
         public static void main(String[] args)throws Exception {
        	 ChromeDriver driver = new ChromeDriver();
        	 driver.get("https://admin-demo.nopcommerce.com/login");
        	 driver.findElement(By.id("Email")).clear();
        	 driver.findElement(By.name("Password")).clear();
        	 driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
        	 driver.findElement(By.id("Password")).sendKeys("admin");
        	 driver.findElement(By.name("RememberMe")).click();
        	 driver.findElement(By.tagName("button")).click();
        	 Thread.sleep(3000);
        	 driver.findElement(By.linkText("Logout")).click();
        	 Thread.sleep(3000);
        	 driver.quit();
        	 
        	 
         }
         

}
