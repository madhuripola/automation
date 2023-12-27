package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr10 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(3000);
		driver.findElement(By.name("alertbox")).click();
		Thread.sleep(3000);
		Alert popup = driver.switchTo().alert();

		popup.accept();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();

		driver.findElement(By.name("confirmalertbox")).click();
		Alert popup1 = driver.switchTo().alert();
		popup1.dismiss();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();

		driver.findElement(By.name("confirmalertbox")).click();

		popup1.accept();
		driver.switchTo().defaultContent();
		driver.findElement(By.name("promptalertbox1234")).click();
		Alert popup2 = driver.switchTo().alert();
		popup2.sendKeys("Yes");
		Thread.sleep(5000);
		popup2.dismiss();
		driver.switchTo().defaultContent();
		driver.findElement(By.name("promptalertbox1234")).click();
		popup2.sendKeys("No");
		Thread.sleep(5000);
		popup2.accept();
		Thread.sleep(5000);
		driver.quit();

	}

}
