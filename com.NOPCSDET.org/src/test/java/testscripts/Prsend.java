package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prsend {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(2000);
		WebElement sup = driver.findElement(By.xpath("(//div[@class='oxd-autocomplete-wrapper'])[2]/descendant::input"));
		sup.click();
		sup.sendKeys(Keys.TAB,Keys.DOWN,Keys.TAB,Keys.DOWN,Keys.ENTER);

		driver.findElement(By.xpath("//button[text()=' Search ']")).click();

	}

}
