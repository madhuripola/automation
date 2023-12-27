package practice;

import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Pr16 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Email = (WebElement) js.executeScript("return document.getElementById('Email');");
		Email.clear();
		Thread.sleep(3000);

		js.executeScript("document.getElementById('Email').value='admin@yourstore.com';");
		js.executeScript("document.getElementById('Email').style.border='10px red dotted';");
		js.executeScript("document.getElementById('Email').style.background='pink';");
		WebElement pws = (WebElement) js.executeScript("return document.getElementsByName('Password')[0];");
		pws.clear();
		Thread.sleep(3000);

		js.executeScript("document.getElementsByName('Password')[0].style.border='10px yellow dashed';");
		js.executeScript("document.getElementsByName('Password')[0].style.background='brown';");
		js.executeScript("document.getElementsByName('Password')[0].value='admin';");
		Thread.sleep(3000);
		js.executeScript("document.getElementsByTagName('button')[0].click();");
		Thread.sleep(3000);
		driver.quit();

	}
}
