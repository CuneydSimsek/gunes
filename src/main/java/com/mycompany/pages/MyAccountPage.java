package com.mycompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

	WebDriver driver; // 'driver' burada benim bu class'taki object'im

	public MyAccountPage(WebDriver driver) {
		super();
		this.driver = driver; 
		
	}
	
	
	public void getTitle() { 
		System.out.println(driver.getTitle());

	
	}
	
	public MyAccountPage asLogin(String uname, String pword) throws InterruptedException { //page object model=OOPS
		
		driver.findElement(By.name("username")).sendKeys(uname);
	    driver.findElement(By.id("password")).sendKeys(pword);
	    driver.findElement(By.cssSelector("input[value=forever]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.name("login")).click();                    
	   	return new MyAccountPage(driver);

	
	}
	
}
