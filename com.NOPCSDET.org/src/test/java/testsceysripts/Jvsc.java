package testsceysripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jvsc {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement username = (WebElement) js.executeScript("return document.getElementsByName('username')[0];");
		Thread.sleep(3000);
		js.executeScript("document.getElementsByName('username')[0].value='Admin';");

		js.executeScript("document.getElementsByName('username')[0].style.border='10px yellow dotted';");

	
		js.executeScript("document.getElementsByName('password')[0].value='admin123';");

		js.executeScript("document.getElementsByName('password')[0].style.border='10px green solid';");

		js.executeScript("document.getElementsByTagName('button')[0].click();");

	}

}
