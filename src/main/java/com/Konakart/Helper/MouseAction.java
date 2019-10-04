package com.Konakart.Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Konakart.BrowserSetup.BrowserSetup;

public class MouseAction extends BrowserSetup {
	static Actions action = new Actions(driver);
	static JavascriptExecutor js = (JavascriptExecutor) driver;

	public static void mouseOver(String element) {
		WebElement elements = driver.findElement(By.xpath(element));
		action.moveToElement(elements).click().perform();
	}

	public static void scrollDown() {
		js.executeScript("window.scrollBy(0,5000)");
	}

	public static void scrollUp() {
		js.executeScript("window.scrollBy(0,-5000)");
	}

	public static void scrollleft() {
		js.executeScript("window.scrollBy(5000,0)");
	}

	public static void scrollright() {
		js.executeScript("window.scrollBy(-5000,0)");
	}

	public void scrollIntoView(String locatorType, String element) {
		try {
			switch ("locatorType") {
			case "ClassName":
				WebElement classElement = driver.findElement(By.className(element));
				js.executeScript("arguments[0].scrollIntoView();", classElement);
				break;
			case "CssSelector":
				WebElement cssElement = driver.findElement(By.className(element));
				js.executeScript("arguments[0].scrollIntoView();", cssElement);
				break;
			case "Id":
				WebElement idElement = driver.findElement(By.className(element));
				js.executeScript("arguments[0].scrollIntoView();", idElement);
				break;
			case "LinkText":
				WebElement Element = driver.findElement(By.className(element));
				js.executeScript("arguments[0].scrollIntoView();", Element);
				break;
			case "Name":
				WebElement nameElement = driver.findElement(By.className(element));
				js.executeScript("arguments[0].scrollIntoView();", nameElement);
				break;
			case "PartialLinkText":
				WebElement partialLinkTextElement = driver.findElement(By.className(element));
				js.executeScript("arguments[0].scrollIntoView();", partialLinkTextElement);
				break;
			case "TagName":
				WebElement tagNameElement = driver.findElement(By.className(element));
				js.executeScript("arguments[0].scrollIntoView();", tagNameElement);
				break;
			case "XPath":
				WebElement xpathElement = driver.findElement(By.className(element));
				js.executeScript("arguments[0].scrollIntoView();", xpathElement);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
