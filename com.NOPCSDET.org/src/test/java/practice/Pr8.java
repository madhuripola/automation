package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr8 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();

		WebElement ele1 = driver.findElement(By.xpath("(//div[@class='oxd-form-row']/descendant::input)[1]"));
		ele1.click();
		Thread.sleep(3000);
		ele1.sendKeys(Keys.TAB, Keys.DOWN, Keys.DOWN, Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
