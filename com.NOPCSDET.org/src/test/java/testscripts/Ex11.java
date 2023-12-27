package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex11 {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.name("Email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.tagName("button"));
		System.out.println(ele1);
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		Thread.sleep(5000);
		WebElement ele2 = driver.findElement(By.xpath("//p[text()=' Dashboard']"));
		System.out.println(ele2);
		ele2.click();
		List<WebElement> allinputs = driver.findElements(By.xpath("//input"));

		int count = allinputs.size();
		System.out.println(count);
		List<WebElement> allinputs1 = driver.findElements(By.tagName("inpu"));
		int count1 = allinputs1.size();
		System.out.println(count1);

		driver.quit();

	}

}
