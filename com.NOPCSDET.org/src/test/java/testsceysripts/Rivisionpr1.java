package testsceysripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rivisionpr1 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		driver.findElement(By.name("Email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		boolean val = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed();
		if (val == true) {
			System.out.println("Login success");
		} else {
			System.out.println("Login failed");
		}
		driver.findElement(By.xpath("//p[contains(text(),'Catalog')][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[contains(text(),'Products')][1]")).click();
		Thread.sleep(3000);
		WebElement category = driver.findElement(By.id("SearchCategoryId"));
		Select selection = new Select(category);
		selection.selectByVisibleText("Books");
		Thread.sleep(3000);
		selection.selectByValue("0");
		Thread.sleep(3000);
		selection.selectByIndex(1);
		Thread.sleep(3000);
		List<WebElement> alloptions = selection.getOptions();
		int count = alloptions.size();
		System.out.println("alloptions count is:" + count);
		String val1 = alloptions.get(3).getText();
		System.out.println(val1);
		Thread.sleep(3000);
		for (int i = 0; i < count; i++) {
			String val2 = alloptions.get(i).getText();
			System.out.println("all options texts are:" + val2);
		}
		Thread.sleep(3000);
		driver.quit();

	}
}
