package testscripts;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Endtoend{

		public static void main(String[] args) throws Exception {

			// launch the Chrome browser
			ChromeDriver driver = new ChromeDriver();

			// open NC login page
			driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

			// Do login
			driver.findElement(By.name("Email")).clear();
			driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");

			driver.findElement(By.id("Password")).clear();
			driver.findElement(By.id("Password")).sendKeys("admin");

			driver.findElement(By.xpath("//*[text()='Log in']")).click();

			Thread.sleep(7000);

			// Verify Login success
			boolean val = driver.findElement(By.xpath("//h1[contains(text(), 'Dashboard')]")).isDisplayed();

			if (val == true) {
				System.out.println("Login Success");
			} else {
				System.out.println("Login Failed");
			}

			// click on catalog
			driver.findElement(By.xpath("(//p[contains(text(), 'Catalog')])[1]")).click();
			Thread.sleep(3000);

			// click on products
			driver.findElement(By.xpath("(//p[contains(text(), ' Products')])[1]")).click();
			Thread.sleep(5000);

			// select checkbox
			boolean checkVal = driver.findElement(By.xpath("(//input[@name='checkbox_products'])[1]")).isSelected();
			if (checkVal == true) {
				System.out.println("Check box already got selected");
			} else {
				System.out.println("Check box not yet selected");
			}

			driver.findElement(By.xpath("(//input[@name='checkbox_products'])[1]")).click();

			// delete selected product
			driver.findElement(By.id("delete-selected")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[contains(text(), 'Yes')]")).click();
			Thread.sleep(4000);
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

			// terminate entire browser
			driver.quit();

		}

	}

