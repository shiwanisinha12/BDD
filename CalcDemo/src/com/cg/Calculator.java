package com.cg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Calculator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Users\\shiwansi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.math.com/students/calculators/source/basic.htm");
		PageFactory.initElements(driver, HomePage.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		HomePage.firstNumber(driver).click();
	
		HomePage.add(driver).click();
		HomePage.secondNumber.click();
		HomePage.equal.click();
	}
}
