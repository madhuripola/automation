package testsceysripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class Revisionpr13 {
	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		String title = driver.getTitle();

		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String srccode = driver.getPageSource();
		System.out.println(srccode);
		driver.quit();
	}
}
