package com.Konakart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Konakart.BrowserSetup.BrowserSetup;
import com.Konakart.Constants.Constants;
import com.Konakart.Properties.ReadProperties;

public class ValidateDropdown extends BrowserSetup {

	public static void validateDropdownValue(WebElement element, String value) throws Exception {

		element.sendKeys(value);
		driver.findElement(By.xpath(ReadProperties.properties("loc_search_btn", Constants.pathProperties_file)))
				.click();
	}
}
