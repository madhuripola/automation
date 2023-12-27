package testsceysripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rivisionpr2 {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(3000);
		WebElement EN = driver
				.findElement(By.xpath("//div[@class='oxd-autocomplete-wrapper'][1]/descendant::input[1]"));
		EN.click();
		Thread.sleep(7000);
		EN.sendKeys(Keys.TAB, Keys.TAB, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		Thread.sleep(7000);
		driver.quit();

	}

}
