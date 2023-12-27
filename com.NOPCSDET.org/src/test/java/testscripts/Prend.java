package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prend {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		driver.findElement(By.name("Email")).clear();
		Thread.sleep(2000);

		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.name("Password")).clear();
		Thread.sleep(2000);

		driver.findElement(By.name("Password")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		boolean val = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed();
		if (val == true) {
			System.out.println("Login success");

		}

		else {
			System.out.println("Login failed");

		}
		driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[contains(text(),'Products')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='SearchProductName']")).sendKeys("Books");
		Thread.sleep(3000);
		WebElement catgory = driver.findElement(By.xpath("//select[@id='SearchCategoryId']"));
		Select selection = new Select(catgory);
		selection.selectByVisibleText("Books");
		Thread.sleep(3000);
		List<WebElement> alloptions = selection.getOptions();
		int count = alloptions.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String alldata = alloptions.get(i).getText();
			System.out.println(alldata);
		}
		driver.findElement(By.xpath("//button[@id='search-products']")).click();
		Thread.sleep(3000);
		boolean val1 = driver.findElement(By.xpath("(//input[@name='checkbox_products'])[1]")).isSelected();
		if (val1 == true) {
			System.out.println("Checkbox already got selected ");
		} else {

			System.out.println("Checkbox not yet selected ");
		}

		driver.findElement(By.xpath("(//input[@name='checkbox_products'])[1]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='delete-selected']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();

	}

}
