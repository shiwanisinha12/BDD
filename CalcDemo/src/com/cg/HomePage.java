package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	private static WebElement element=null;
	public static WebElement firstNumber(WebDriver driver)
	{
		element=driver.findElement(By.name("four"));
		return element;
	}
	
	@FindBy(how=How.NAME,using="five")
	public static WebElement secondNumber;
	
	public static WebElement add(WebDriver driver)
	{
		element=driver.findElement(By.name("plus"));
		return element;
	}
	@FindBy(name="DoIt")
	public static WebElement equal;
}
