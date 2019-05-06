package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.Uslocators;

public class LoanAndCredit extends Config{

	Uslocators USL= new Uslocators();
	

	
	
	@Test(priority=1)
	public void onlinecredit(){
		
		driver.findElement(By.xpath(USL.online)).click();
	}
	
	
	
	@Test(priority=2)
	public void mobilebanking(){
		driver.findElement(By.xpath(USL.mobile)).click();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
