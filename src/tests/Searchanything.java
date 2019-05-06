package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Values.Usbankvalue;
import base.Config;
import locators.Uslocators;

public class Searchanything extends Config {

	Uslocators USL= new Uslocators();
	Usbankvalue ULV= new Usbankvalue();
	
	
	@Test
	
	public void Searchoption(){
		
		driver.findElement(By.xpath(USL.usBankSearch)).sendKeys(ULV.searchValue);
		
	}

	
	
	
	
	
	
	

}
