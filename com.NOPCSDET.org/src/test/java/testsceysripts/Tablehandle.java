package testsceysripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablehandle {
	public static void main(String[] args) throws Exception {

		// launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();

		// open NC login page
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		// Do login
		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");

		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");

		driver.findElement(By.xpath("//*[text()='Log in']")).click();

		Thread.sleep(7000);

		// Verify Login success
		boolean val = driver.findElement(By.xpath("//h1[contains(text(), 'Dashboard')]")).isDisplayed();

		if (val == true) {
			System.out.println("Login Success");
		} else {
			System.out.println("Login Failed");
		}

		// click on catalog
		driver.findElement(By.xpath("(//p[contains(text(), 'Catalog')])[1]")).click();
		Thread.sleep(3000);

		// click on products
		driver.findElement(By.xpath("(//p[contains(text(), ' Products')])[1]")).click();
		Thread.sleep(3000);
		// To handle table
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr"));
		Thread.sleep(3000);
		int rcount = allrows.size();
		System.out.println("all rows count is:" + rcount);
		Thread.sleep(3000);
		List<WebElement> allcolumns = driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr[1]/td"));
		Thread.sleep(3000);
		int ccount = allcolumns.size();
		System.out.println("all columns count is:" + ccount);
		for (int r = 1; r <= rcount; r++) {
			for (int c = 1; c <= ccount; c++) {
				String alldata = driver
						.findElement(By.xpath("//table[@id='products-grid']/tbody/tr[" + r + "]/td[" + c + "]"))
						.getText();
				System.out.print(alldata + "     ");

			}
			System.out.println();
		}

		Thread.sleep(5000);
		driver.quit();

	}
}