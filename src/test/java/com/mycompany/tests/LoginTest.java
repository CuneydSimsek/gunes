package com.mycompany.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest{

	//public static void main(String[] args) throws InterruptedException  {
		
		
		@Test
		public void myTest() throws InterruptedException {
			
			
		System.setProperty("webdriver.chrome.driver","Util\\chromedriver.exe"); //path
	    WebDriver driver = new ChromeDriver(); 
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.get("http://test1.itcareercenter.us"); 
	    driver.findElement(By.xpath("//a[@title='My account']")).click(); 
	    
	    driver.findElement(By.name("username")).sendKeys("testuser1");
	    driver.findElement(By.id("password")).sendKeys("SeleniumTestAccount1");
	    
	    driver.findElement(By.cssSelector("input[value=forever]")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.name("login")).click();                    
	   
	    Thread.sleep(3000);
	    driver.close();

		
	}

}
