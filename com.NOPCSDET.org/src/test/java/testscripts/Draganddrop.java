package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(3000);
		driver.switchTo().frame(3);
		Thread.sleep(3000);
		WebElement source = driver.findElement(By.xpath("//h5[text()='High Tatras']/following-sibling::img"));
		WebElement target = driver.findElement(By.id("trash"));
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
		Thread.sleep(3000);
		driver.quit();

	}
}