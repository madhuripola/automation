package testsceysripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jvsct {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement email = (WebElement) js.executeScript("return document.getElementById('Email');");
		Thread.sleep(3000);
		email.clear();
		Thread.sleep(3000);
		js.executeScript("document.getElementById('Email').value='admin@yourstore.com';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('Email').style.border='10px green solid';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('Email').style.background='red';");
		WebElement pws = (WebElement) js.executeScript("return document.getElementById('Password');");
		Thread.sleep(3000);
		pws.clear();
		Thread.sleep(3000);
		js.executeScript("document.getElementById('Password').value='admin';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('Password').style.border='10px pink solid';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('Password').style.background='yellow';");
		Thread.sleep(3000);
		js.executeScript("document.getElementsByTagName('button')[0].click();");
		Thread.sleep(2000);
		driver.quit();

	}
}