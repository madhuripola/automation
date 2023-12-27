package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr5 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);

		driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();

		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String srccode = driver.getPageSource();
		System.out.println(srccode);
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.name("Password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(3000);
		String currentbrowwinid = driver.getWindowHandle();
		System.out.println(currentbrowwinid);
		driver.findElement(By.xpath("//p[contains(text(),'Help')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(),'Training')]")).click();
		Thread.sleep(5000);
		Set<String> allbrowwinids = driver.getWindowHandles();

		System.out.println(allbrowwinids);
		driver.close();
		Thread.sleep(5000);
		driver.quit();
	}

}
