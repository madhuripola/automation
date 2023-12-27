package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr11 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.name("Password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(3000);
		boolean val = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed();
		if (val == true) {
			System.out.println("Login success");
		} else {
			System.out.println("Login failed");
		}
		driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[contains(text(),'Products')])[1]")).click();

		Thread.sleep(3000);

		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr"));
		int rcount = allrows.size();
		System.out.println("allrows count is:" + rcount);
		List<WebElement> allcolumns = driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr[1]/td"));
		int ccount = allcolumns.size();
		System.out.println("allcolumns count is:" + ccount);
		for (int r = 1; r <= rcount; r++) {
			for (int c = 1; c <= ccount; c++) {

				String text = driver
						.findElement(By.xpath("//table[@id='products-grid']/tbody/tr[" + r + "]/td[" + c + "]"))
						.getText();

				System.out.print(text + " ");
			}
			System.out.println();

		}

	}

}
