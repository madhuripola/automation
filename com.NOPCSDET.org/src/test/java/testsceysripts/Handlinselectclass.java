package testsceysripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlinselectclass {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://formstone.it/components/dropdown/demo/");
		Thread.sleep(3000);
		WebElement Label = driver.findElement(By.xpath("//select[@id='demo_label']"));
		Select selection = new Select(Label);
		selection.selectByVisibleText("California");
		Thread.sleep(4000);

		selection.selectByValue("MI");
		Thread.sleep(4000);
		List<WebElement> alloptions = selection.getOptions();
		int count = alloptions.size();
		System.out.println(count);
		String option = alloptions.get(5).getText();
		System.out.println(option);
		for (int i = 0; i < count; i++) {
			String option1 = alloptions.get(i).getText();
			System.out.println(option1);
			Thread.sleep(4000);

		}

	}

}
