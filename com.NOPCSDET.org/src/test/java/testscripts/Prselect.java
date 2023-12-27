package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prselect {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://formstone.it/components/dropdown/demo/");
		Thread.sleep(3000);
		WebElement label = driver.findElement(By.id("demo_label"));
		Select selection = new Select(label);
		selection.selectByIndex(1);
		Thread.sleep(2000);
		selection.selectByVisibleText("Alaska");
		Thread.sleep(2000);

		selection.selectByValue("HI");
		Thread.sleep(2000);
		List<WebElement> alldata = selection.getOptions();
		int count = alldata.size();
		System.out.println(count);
		Thread.sleep(3000);
		String data = alldata.get(5).getText();
		System.out.println(data);
		for (int i = 0; i < count; i++) {
			String allthedata = alldata.get(i).getText();
			System.out.println(allthedata);
		}
	}

}
