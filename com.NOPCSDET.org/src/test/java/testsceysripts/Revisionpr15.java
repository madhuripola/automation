package testsceysripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revisionpr15 {
	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login");

		driver.findElement(By.name("Email")).clear();

		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");

		driver.findElement(By.name("Password")).clear();

		driver.findElement(By.name("Password")).sendKeys("admin");

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		boolean val = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed();
		if (val == true) {
			System.out.println("Login success");
		} else {
			System.out.println("Login failed");
		}
		driver.findElement(By.xpath("//p[contains(text(),'Catalog')][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[contains(text(),'Products')][1]")).click();
		Thread.sleep(3000);

		boolean val2 = driver.findElement(By.xpath("//input[@name='checkbox_products'][1]")).isSelected();
		if (val2 == true) {
			System.out.println("Check box already got selected");
		} else {
			System.out.println("Check box is not yet selected");
		}

		driver.findElement(By.xpath("//input[@name='checkbox_products'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("delete-selected")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(7000);

		driver.quit();

	}

}
