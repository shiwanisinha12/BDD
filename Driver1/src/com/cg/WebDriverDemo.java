package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class WebDriverDemo {
	
	public static void main(String[] args) {
		WebDriver driver ;
		 System.setProperty("webdriver.chrome.driver", "D:\\Users\\shiwansi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.google.com");
		
		//WebElement searchField = driver.findElement(By.id("lst-ib"));
		PageFactory.initElements(driver, WebElementPage.class);
		WebElementPage.search.sendKeys("pluralsight");
		WebElementPage.search.submit();
		
		//WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
		WebElementPage.iLink.click();
		
		//WebElement imageElement = driver.findElements(By.cssSelector("a[class = rg_l]")).get(0);
		//WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
		WebElementPage.imgElement.click();
		//WebElementPage.imageLink.click();
	}

}
