package com.mycompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver; // 'driver' burada benim bu class'taki object'em 

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver; 
		
	}
	
	
	public void getTitle() { 
		System.out.println(driver.getTitle());

	}
	
	public MyAccountPage clickMyAccount() {
		
		driver.findElement(By.xpath("//a[@title='My account']")).click();
		
		return new MyAccountPage(driver); 
		
		
		
	}
	
}
