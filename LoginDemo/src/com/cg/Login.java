package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\shiwansi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement searchField = driver.findElement(By.id("lst-ib"));
		searchField.sendKeys("github login");
		searchField.submit();
		
		WebElement link = driver.findElements(By.linkText("Login - GitHub")).get(0);
		link.click();
		
		WebElement username=driver.findElement(By.id("login_field"));
		username.sendKeys("shiwani.a.sinha@capgemini.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Shiwani12@1996");
		password.submit();
		if(driver.getCurrentUrl().equalsIgnoreCase("https://github.com/"))
			System.out.println("logged in");
		else
			System.out.println("error");
		
	}
}
