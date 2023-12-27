package testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prmeth {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String srscode = driver.getPageSource();
		System.out.println(srscode);
		driver.findElement(By.name("Email")).clear();

		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");

		driver.findElement(By.name("Password")).clear();

		driver.findElement(By.name("Password")).sendKeys("admin");

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);

		driver.navigate().to("https://admin-demo.nopcommerce.com/admin/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String currbrowwinid = driver.getWindowHandle();
		System.out.println(currbrowwinid);

		driver.findElement(By.xpath("//p[contains(text(),'Help')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Documentation')]")).click();
		Thread.sleep(3000);
		Set<String> allbrowwinids = driver.getWindowHandles();
		System.out.println(allbrowwinids);
		driver.close();
		Thread.sleep(3000);
		driver.quit();

	}

}
