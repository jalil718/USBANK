package tests;

import utils.Xls_Reader;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.Uslocators;

public class ReadFromxl extends Config {

	Xls_Reader xl = new Xls_Reader (System.getProperty("user.dir")+"//testCase.xlsx");
	
	Uslocators lc= new Uslocators();
	@Test
	public void testReadfromxl(){
		//String value = xl.getCellData(sheetName, colName, rowNum)
				String value = xl.getCellData("facebook", "TestData", 2);
//				System.out.println("value" + value);
				driver.findElement(By.xpath(lc.usBankSearch)).sendKeys(value);
	}
	
}
