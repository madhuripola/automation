package testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex12 {
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
		driver.navigate().to("https://admin-demo.nopcommerce.com/Admin/Product/List");
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);

		String srccode = driver.getPageSource();
		System.out.println(srccode);
		String firstbrowwinid = driver.getWindowHandle();
		System.out.println(firstbrowwinid);
		driver.findElement(By.xpath("//p[contains(text(),'Catalog')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()=' Manufacturers']")).click();
		Thread.sleep(2000);
		Set<String> allbrowwinids = driver.getWindowHandles();
		System.out.println(allbrowwinids);
		driver.close();
		Thread.sleep(3000);
		driver.quit();

	}

}
