package com.Konakart.Testscript;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Konakart.BrowserSetup.BrowserSetup;
import com.Konakart.Constants.Constants;
import com.Konakart.Helper.Assertion;
import com.Konakart.Properties.ReadProperties;
import com.Konakart.Utilities.ExcelUtils;

/**
 * Validate product description content. Validate product specification content.
 * Validate product review by sort it with all combinations.
 * 
 * @author indira.saravanan
 *
 */

public class ValidateProductDetails extends BrowserSetup {

	// It read value from excel sheet.
	@DataProvider
	public Object[][] possibleValues() {
		Object data[][] = ExcelUtils.ReadWriteExcel("Sheet2");
		return data;
	}

	// @Test(dataProvider = "moreInfoLink", priority = 1

	@Test(dataProvider = "possibleValues")
	public void validateproduct(String productdescription) throws Exception {
		driver.findElement(By.xpath(ReadProperties.properties("loc_heroimage_img", Constants.pathProperties_file)))
				.click();
		String element = driver
				.findElement(By
						.xpath(ReadProperties.properties("loc_productdescription_txt", Constants.pathProperties_file)))
				.getText();
		Assertion.assertEquals(element, productdescription);

	}

}
