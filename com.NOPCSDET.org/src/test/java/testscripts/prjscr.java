package testscripts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prjscr {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement email = (WebElement) js.executeScript("return document.getElementById('Email');");
		email.clear();
		Thread.sleep(2000);
		js.executeScript("document.getElementById('Email').value='admin@yourstore.com';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('Email').style.border='5px pink solid';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('Email').style.background='yellow';");
		Thread.sleep(2000);
		WebElement pswd = (WebElement) js.executeScript("return document.getElementById('Password');");
		pswd.clear();
		Thread.sleep(2000);
		js.executeScript("document.getElementById('Password').value='admin';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('Password').style.border='5px black solid';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('Password').style.background='orange';");
		Thread.sleep(2000);
		js.executeScript("document.getElementsByTagName('button')[0].click();");
		Thread.sleep(2000);
		driver.quit();

	}

}
