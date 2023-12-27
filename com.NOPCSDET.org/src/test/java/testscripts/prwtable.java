package testscripts;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prwtable {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");

		driver.findElement(By.name("Password")).clear();
		Thread.sleep(3000);

		driver.findElement(By.name("Password")).sendKeys("admin");

		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(3000);
		boolean val = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed();
		if (val == true) {
			System.out.println("Login success");
		}

		else {
			System.out.println("Login failed");
		}

		driver.findElement(By.xpath("//p[contains(text(),'Catalog')][1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[contains(text(),'Products')][1]")).click();
		Thread.sleep(2000);
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr"));
		int rcount = allrows.size();
		System.out.println("all rows count is:" + rcount);
		List<WebElement> allcolumns = driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr[1]/td"));
		int ccount = allcolumns.size();
		System.out.println("all columns count is:" + ccount);
		for (int r = 1; r <= rcount; r++) {
			for (int c = 1; c <= ccount; c++) {
				String alldata = driver
						.findElement(By.xpath("//table[@id='products-grid']/tbody/tr[" + r + "]/td[" + c + "]"))
						.getText();
				System.out.print(alldata + "    ");
			}
			System.out.println();
		}

	}

}