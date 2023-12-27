package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pr7 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.name("Password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[contains(text(),'Products')])[1]")).click();

		Thread.sleep(3000);
		WebElement dd = driver.findElement(By.xpath("//select[@name='SearchCategoryId']"));

		Select selection = new Select(dd);
		selection.selectByVisibleText("Jewelry");
		Thread.sleep(3000);
		selection.selectByIndex(1);
		Thread.sleep(3000);
		selection.selectByValue("0");
		Thread.sleep(3000);
		List<WebElement> alloptions = selection.getOptions();
		int count = alloptions.size();
		System.out.println(count);
		String a = alloptions.get(1).getText();
		System.out.println(a);
		for (int i = 0; i <count; i++) {
			String options = alloptions.get(i).getText();
			System.out.println(options);
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
