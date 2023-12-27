package testsceysripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlesendkeys {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(2000);

		WebElement empname = driver.findElement(By.xpath("(//div[@class='oxd-autocomplete-wrapper'])[1]/descendant::input"));

		empname.click();
		Thread.sleep(3000);
		empname.sendKeys(Keys.TAB, Keys.TAB, Keys.DOWN, Keys.DOWN, Keys.DOWN,Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		Thread.sleep(10000);
		driver.quit();

	}
}
