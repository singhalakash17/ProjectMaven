package exzeo.project.ProjectMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test01 {
	
	WebElement currentElement=null;
	WebDriverWait wait= null;
	
	@Test
	public void firstTest() {
		
		try{
			
			WebDriver driver= new FirefoxDriver(); 
			wait= new WebDriverWait(driver,10);
			driver.get("http://www.claimcolony.com");
			
			currentElement= driver.findElement(By.id("login_userName"));
			currentElement.sendKeys("pcsupervisor");
	
			currentElement= driver.findElement(By.id("login_password"));
			currentElement.sendKeys("12345678");
			
			currentElement= driver.findElement(By.id("btnLogin"));
			currentElement.submit();
		
			driver.close();
		}
		
	 catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}	
	
}
