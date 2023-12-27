package testsceysripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revisionpr14 {
	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login");

		driver.findElement(By.name("Email")).clear();

		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");

		driver.findElement(By.name("Password")).clear();

		driver.findElement(By.name("Password")).sendKeys("admin");

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		driver.navigate().to("https://admin-demo.nopcommerce.com/Admin/Product/List");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String srccode = driver.getPageSource();
		System.out.println(srccode);
		String firstbrowwinId = driver.getWindowHandle();
		System.out.println(firstbrowwinId);
		driver.navigate().to("https://admin-demo.nopcommerce.com/admin/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(),'Catalog')][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[contains(text(),'Manufacturers')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[contains(text(),'Help')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[contains(text(),'Training')]")).click();
		Thread.sleep(3000);
		Set<String> allbrowwinIds = driver.getWindowHandles();
		System.out.println(allbrowwinIds);

		Thread.sleep(3000);
		driver.quit();

	}
}