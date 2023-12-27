package javaprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whileloop {
	
	public static void main(String[] args) throws Exception{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	driver.findElement(By.name("Email")).clear();
	Thread.sleep(3000);
	
	driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
	
	
	driver.findElement(By.name("Password")).clear();
	Thread.sleep(3000);
	
	driver.findElement(By.name("Password")).sendKeys("admin");
	driver.findElement(By.tagName("button")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//p[contains(text(),'Products')])[1]")).click();
	Thread.sleep(3000);
	List<WebElement>allrows=driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr"));
	Thread.sleep(3000);
	int rcount=allrows.size();
	System.out.println("all rows count is:"+rcount);
	
	List<WebElement>allcolumns=driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr[1]/td"));
	Thread.sleep(3000);
	int ccount=allcolumns.size();
	System.out.println("all columns count is:"+ccount);
	int r=1;
	while(r<=rcount) {
		
	
		String alldata=driver.findElement(By.xpath("//table[@id='products-grid']/tbody/tr[" + r + "]")).getText();
				
		System.out.println(alldata+"         ");
		
		r++;
		System.out.println();
		
	}
	}

}
