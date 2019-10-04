package com.Konakart.Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Konakart.BrowserSetup.BrowserSetup;

public class ClickOperation extends BrowserSetup {
	static WebDriverWait wait = new WebDriverWait(driver, 30);

	public void pressEnter(String locatorType, String element) {
		try {
			switch (locatorType) {
			case "ClassName":
				driver.findElement(By.className(element)).sendKeys(Keys.ENTER);
				break;
			case "CssSelector":
				driver.findElement(By.cssSelector(element)).sendKeys(Keys.ENTER);
				break;
			case "Id":
				driver.findElement(By.id(element)).sendKeys(Keys.ENTER);
				break;
			case "LinkText":
				driver.findElement(By.linkText(element)).sendKeys(Keys.ENTER);
				break;
			case "Name":
				driver.findElement(By.name(element)).sendKeys(Keys.ENTER);
				break;
			case "PartialLinkText":
				driver.findElement(By.partialLinkText(element)).sendKeys(Keys.ENTER);
				break;
			case "TagName":
				driver.findElement(By.tagName(element)).sendKeys(Keys.ENTER);
				break;
			case "XPath":
				driver.findElement(By.xpath(element)).sendKeys(Keys.ENTER);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void pressReturn(String locatorType, String element) {
		try {
			switch (locatorType) {
			case "ClassName":
				driver.findElement(By.className(element)).sendKeys(Keys.RETURN);
				break;
			case "CssSelector":
				driver.findElement(By.cssSelector(element)).sendKeys(Keys.RETURN);
				break;
			case "Id":
				driver.findElement(By.id(element)).sendKeys(Keys.RETURN);
				break;
			case "LinkText":
				driver.findElement(By.linkText(element)).sendKeys(Keys.RETURN);
				break;
			case "Name":
				driver.findElement(By.name(element)).sendKeys(Keys.RETURN);
				break;
			case "PartialLinkText":
				driver.findElement(By.partialLinkText(element)).sendKeys(Keys.RETURN);
				break;
			case "TagName":
				driver.findElement(By.tagName(element)).sendKeys(Keys.RETURN);
				break;
			case "XPath":
				driver.findElement(By.xpath(element)).sendKeys(Keys.RETURN);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void pressTab(String locatorType, String element) {
		try {
			switch (locatorType) {
			case "ClassName":
				driver.findElement(By.className(element)).sendKeys(Keys.TAB);
				break;
			case "CssSelector":
				driver.findElement(By.cssSelector(element)).sendKeys(Keys.TAB);
				break;
			case "Id":
				driver.findElement(By.id(element)).sendKeys(Keys.TAB);
				break;
			case "LinkText":
				driver.findElement(By.linkText(element)).sendKeys(Keys.TAB);
				break;
			case "Name":
				driver.findElement(By.name(element)).sendKeys(Keys.TAB);
				break;
			case "PartialLinkText":
				driver.findElement(By.partialLinkText(element)).sendKeys(Keys.TAB);
				break;
			case "TagName":
				driver.findElement(By.tagName(element)).sendKeys(Keys.TAB);
				break;
			case "XPath":
				driver.findElement(By.xpath(element)).sendKeys(Keys.TAB);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void click(String locatorType, String element) {

		switch (locatorType) {
		case "ClassName":
			wait.until(ExpectedConditions.elementToBeClickable(By.className(element)));
			driver.findElement(By.className(element)).click();
			break;
		case "CssSelector":
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(element)));
			driver.findElement(By.cssSelector(element)).click();
			break;
		case "Id":
			wait.until(ExpectedConditions.elementToBeClickable(By.id(element)));
			driver.findElement(By.id(element)).click();
			break;
		case "LinkText":
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText(element)));
			driver.findElement(By.linkText(element)).click();
			break;
		case "Name":
			wait.until(ExpectedConditions.elementToBeClickable(By.name(element)));
			driver.findElement(By.name(element)).click();
			break;
		case "PartialLinkText":
			wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(element)));
			driver.findElement(By.partialLinkText(element)).click();
			break;
		case "TagName":
			wait.until(ExpectedConditions.elementToBeClickable(By.tagName(element)));
			driver.findElement(By.tagName(element)).click();
			break;
		case "XPath":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
			driver.findElement(By.xpath(element)).click();
			break;
		default:
			break;
		}
	}

}
