package testsceysripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rivisionpr3 {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(3000);
		driver.findElement(By.name("alertbox")).click();
		Thread.sleep(3000);
		Alert popup1 = driver.switchTo().alert();
		Thread.sleep(3000);
		popup1.accept();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.name("confirmalertbox")).click();
		Thread.sleep(3000);
		Alert popup2 = driver.switchTo().alert();
		Thread.sleep(3000);
		popup2.dismiss();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.name("promptalertbox1234")).click();
		Thread.sleep(3000);
		Alert popup3 = driver.switchTo().alert();
		Thread.sleep(3000);
		String a = popup3.getText();
		System.out.println(a);
		Thread.sleep(3000);
		popup3.sendKeys("Yes");
		Thread.sleep(3000);
		popup3.accept();

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.name("promptalertbox1234")).click();
		Thread.sleep(3000);
		popup3.sendKeys("No");
		Thread.sleep(3000);
		popup3.accept();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.quit();
	}

}
