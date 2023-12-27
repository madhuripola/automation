package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex16 {
	public static void main(String[] args) throws Exception {
//Launch Chrome driver

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Open NC login page
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(2000);
		// Do login
		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(5000);
		boolean val = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed();

		if (val == true) {
			System.out.println("Login success");
		} else {
			System.out.println("Login failed");
		}
		// Click on catalog
		driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();
		Thread.sleep(2000);
		// Click on products
		driver.findElement(By.xpath("//p[contains(text(),'Products')][1]")).click();
		Thread.sleep(2000);
		// send books in product name
		driver.findElement(By.id("SearchProductName")).sendKeys("Books");
		Thread.sleep(2000);

		WebElement category = driver.findElement(By.id("SearchCategoryId"));
		// put category in select class and select "Books"
		Select selection = new Select(category);
		selection.selectByVisibleText("Books");
		Thread.sleep(2000);
		// click on search button
		driver.findElement(By.id("search-products")).click();
		// select check box
		boolean val1 = driver.findElement(By.xpath("(//input[@name='checkbox_products'])[1]")).isSelected();
		if (val1 == true) {
			System.out.println("Checkbox already got selected");
		} else {
			System.out.println("Checkbox not yet selected");
		}
		driver.findElement(By.xpath("(//input[@name='checkbox_products'])[1]")).click();
		// delete first product
		driver.findElement(By.xpath("//button[@id='delete-selected']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
		// Do Logout
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		driver.quit();

	}
}
