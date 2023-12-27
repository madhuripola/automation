package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dowhile {
public static void main(String[] args) throws Exception {

		
		ChromeDriver driver = new ChromeDriver();

		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		
		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");

		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");

		driver.findElement(By.xpath("//*[text()='Log in']")).click();

		Thread.sleep(7000);
	boolean val=driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed();
	if(val==true) {
		System.out.println("Login suceess");
	}
		else {
			System.out.println("Loginfailed");
		}
		
	
	driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//p[contains(text(),'Products')])[1]")).click();
	Thread.sleep(3000);
	
	List<WebElement>allrows=driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr"));
	       int rcount=allrows.size();
	       System.out.println("allrows count is:"  + rcount);
	       
	
	
	       List<WebElement>allcolumns=driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr[1]/td"));
	       int ccount=allcolumns.size();
	     
	       System.out.println("allcolumns count is:"  + ccount);
	    
	    int r=1;
	    do {
	    	String alldata=driver.findElement(By.xpath("//table[@id='products-grid']/tbody/tr["+r+"]")).getText();
	    	
	       System.out.print(alldata);
	       r++;
	  
	       System.out.println();
	    }while(r<=rcount);
	    
	     for(WebElement singleelement:allcolumns) {
	    	 String elecls=singleelement.getAttribute("class");
	    	 System.out.println(elecls);
	     }
	    	 
	    	 
	    	 
	     }
	       
	       
	       
	       
	
	
	
	}
	




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

