package javaprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whiloo {
	public static void main(String[] args)throws Exception {
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
		
		
		
		

		List<WebElement> allrows=driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr"));
		
		int rcount=allrows.size();
		System.out.println(rcount);
		
        List<WebElement> allcolumns=driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr[1]/td"));
		
		int ccount=allcolumns.size();
		System.out.println(ccount);
		for(WebElement single:allrows) {
		String clsname=single.getAttribute("className");
		System.out.println(clsname);
			
		}
	//for(int r=1;r<=rcount;r++) {
			//for(int c=1;c<=ccount;c++) {
			//String alldata=driver.findElement(By.xpath("//table[@id='products-grid']/tbody/tr[" + r + "]/td[" +  c  + "]")).getText();
				//System.out.print(alldata+"     ");
			//}
				//System.out.println();
			
		//	}
				//int i=1;
				//while(i<=rcount) {
					//String alldata=driver.findElement(By.xpath("//table[@id='products-grid']/tbody/tr[" + i+ "]")).getText();
					//System.out.print(alldata+"     ");
					//i++;
					//System.out.println();
				//}
			int i=1;
			do {
				String alldata=driver.findElement(By.xpath("//table[@id='products-grid']/tbody/tr[" + i+ "]")).getText();
				System.out.print(alldata+"     ");
				i++;
				
				System.out.println();
			}while(i<=rcount);
	
		}

				
		
	}


