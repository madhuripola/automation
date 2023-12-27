package testsceysripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Condition {
	public static void main(String[] args)throws Exception{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(5000);
		driver.findElement(By.name("Email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.name("Password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		boolean val=driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed();
		if(val==true) {
			System.out.println("Login success");
			driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();
			
		}
		else {
			System.out.println("Login failed");
	}
driver.quit();	

}
	
}
