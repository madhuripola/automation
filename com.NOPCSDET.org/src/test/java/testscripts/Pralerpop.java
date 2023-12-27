package testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pralerpop {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(3000);
		driver.findElement(By.name("alertbox")).click();
		Thread.sleep(3000);

		Alert popup = driver.switchTo().alert();
		Thread.sleep(3000);
		popup.accept();
		Thread.sleep(3000);

		driver.findElement(By.name("confirmalertbox")).click();
		Thread.sleep(3000);
		Alert popup1 = driver.switchTo().alert();
		Thread.sleep(3000);
		popup1.dismiss();
		Thread.sleep(3000);
		driver.findElement(By.name("promptalertbox1234")).click();
		Thread.sleep(3000);
		Alert popup2 = driver.switchTo().alert();
		String txt = popup2.getText();
		System.out.println(txt);
		Thread.sleep(3000);
		popup2.sendKeys("Yes");
		Thread.sleep(3000);
		popup2.accept();
		Thread.sleep(3000);
		driver.findElement(By.name("promptalertbox1234")).click();
		Thread.sleep(3000);
		popup2.sendKeys("No");
		Thread.sleep(3000);
		popup2.accept();
		Thread.sleep(3000);
	}

}
