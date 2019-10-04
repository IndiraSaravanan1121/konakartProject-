package com.Konakart.Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Konakart.BrowserSetup.BrowserSetup;

public class Action extends BrowserSetup {

	public void selectByIndex(String locatorType, String element, int index) {
		try {
			switch (locatorType) {
			case "ClassName":
				WebElement classElement = driver.findElement(By.className(element));
				Select newClassElement = new Select(classElement);
				newClassElement.selectByIndex(index);
				break;
			case "CssSelector":
				WebElement cssElement = driver.findElement(By.cssSelector(element));
				Select newCssElement = new Select(cssElement);
				newCssElement.selectByIndex(index);
				break;
			case "Id":
				WebElement idElement = driver.findElement(By.id(element));
				Select newIdElement = new Select(idElement);
				newIdElement.selectByIndex(index);
				break;
			case "LinkText":
				WebElement linkTextElement = driver.findElement(By.linkText(element));
				Select newlinkTextElement = new Select(linkTextElement);
				newlinkTextElement.selectByIndex(index);
				break;
			case "Name":
				WebElement nameElement = driver.findElement(By.className(element));
				Select newNameElement = new Select(nameElement);
				newNameElement.selectByIndex(index);
				break;
			case "PartialLinkText":
				WebElement partialLinkTextElement = driver.findElement(By.className(element));
				Select newPartialLinkTextElement = new Select(partialLinkTextElement);
				newPartialLinkTextElement.selectByIndex(index);
				break;
			case "TagName":
				WebElement tagNameElement = driver.findElement(By.className(element));
				Select newTagNameElement = new Select(tagNameElement);
				newTagNameElement.selectByIndex(index);
				break;
			case "XPath":
				WebElement xpathElement = driver.findElement(By.className(element));
				Select newXpathElements = new Select(xpathElement);
				newXpathElements.selectByIndex(index);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void selectByValue(String locatorType, String element, String value) {
		try {
			switch (locatorType) {
			case "ClassName":
				WebElement classElement = driver.findElement(By.className(element));
				Select newClassElement = new Select(classElement);
				newClassElement.selectByValue(value);
				break;
			case "CssSelector":
				WebElement cssElement = driver.findElement(By.cssSelector(element));
				Select newCssElement = new Select(cssElement);
				newCssElement.selectByValue(value);
				break;
			case "Id":
				WebElement idElement = driver.findElement(By.id(element));
				Select newIdElement = new Select(idElement);
				newIdElement.selectByValue(value);
				break;
			case "LinkText":
				WebElement linkTextElement = driver.findElement(By.linkText(element));
				Select newlinkTextElement = new Select(linkTextElement);
				newlinkTextElement.selectByValue(value);
				break;
			case "Name":
				WebElement nameElement = driver.findElement(By.className(element));
				Select newNameElement = new Select(nameElement);
				newNameElement.selectByValue(value);
				break;
			case "PartialLinkText":
				WebElement partialLinkTextElement = driver.findElement(By.className(element));
				Select newPartialLinkTextElement = new Select(partialLinkTextElement);
				newPartialLinkTextElement.selectByValue(value);
				break;
			case "TagName":
				WebElement tagNameElement = driver.findElement(By.className(element));
				Select newTagNameElement = new Select(tagNameElement);
				newTagNameElement.selectByValue(value);
				break;
			case "XPath":
				WebElement xpathElement = driver.findElement(By.className(element));
				Select newXpathElements = new Select(xpathElement);
				newXpathElements.selectByValue(value);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectByVisibleText(String locatorType, String element, String visibleText) {
		try {
			switch ("locatorType") {
			case "ClassName":
				WebElement classElement = driver.findElement(By.className(element));
				Select newClassElement = new Select(classElement);
				newClassElement.selectByVisibleText(visibleText);
				break;
			case "CssSelector":
				WebElement cssElement = driver.findElement(By.cssSelector(element));
				Select newCssElement = new Select(cssElement);
				newCssElement.selectByVisibleText(visibleText);
				break;
			case "Id":
				WebElement idElement = driver.findElement(By.id(element));
				Select newIdElement = new Select(idElement);
				newIdElement.selectByVisibleText(visibleText);
				break;
			case "LinkText":
				WebElement linkTextElement = driver.findElement(By.linkText(element));
				Select newlinkTextElement = new Select(linkTextElement);
				newlinkTextElement.selectByVisibleText(visibleText);
				break;
			case "Name":
				WebElement nameElement = driver.findElement(By.className(element));
				Select newNameElement = new Select(nameElement);
				newNameElement.selectByVisibleText(visibleText);
				break;
			case "PartialLinkText":
				WebElement partialLinkTextElement = driver.findElement(By.className(element));
				Select newPartialLinkTextElement = new Select(partialLinkTextElement);
				newPartialLinkTextElement.selectByVisibleText(visibleText);
				break;
			case "TagName":
				WebElement tagNameElement = driver.findElement(By.className(element));
				Select newTagNameElement = new Select(tagNameElement);
				newTagNameElement.selectByVisibleText(visibleText);
				break;
			case "XPath":
				WebElement xpathElement = driver.findElement(By.className(element));
				Select newXpathElements = new Select(xpathElement);
				newXpathElements.selectByVisibleText(visibleText);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
