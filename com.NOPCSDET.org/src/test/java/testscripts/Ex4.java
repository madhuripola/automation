package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(5000);
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='Emai']"));
		ele1.clear();
		WebElement ele2 = driver.findElement(By.xpath("//input[@name='Password']"));
		ele2.clear();
		Thread.sleep(5000);
		driver.quit();

	}

}
