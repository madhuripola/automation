package testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex10 {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='Password']")).clear();
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		Thread.sleep(7000);

		String webbroid = driver.getWindowHandle();
		System.out.println(webbroid);
		driver.findElement(By.xpath("//p[contains(text(),'Help')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[contains(text(),'Training')]")).click();
		Thread.sleep(3000);
		Set<String> allwebbroids = driver.getWindowHandles();
		System.out.println(allwebbroids);
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.quit();
	}

}
