package com.cg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\shiwansi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new  ChromeDriver();
		driver.get("file:D:\\BDD\\SignUp\\src\\main\\webapp\\index.html");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.MINUTES);
		WebElement fname=driver.findElement(By.id("txt1"));
		fname.sendKeys("sh67");
		//*[@id="txt1"]
		
		WebElement mname=driver.findElement(By.name("user"));
		mname.sendKeys("");
		
		WebElement lname=driver.findElements(By.tagName("input")).get(2);
		lname.sendKeys("Sinha");
		
		WebElement mobile=driver.findElement(By.xpath("//*[@id=\"txt4\"]"));
		mobile.sendKeys("9096736965");
		
		WebElement selectCountry=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select select = new Select(selectCountry);
		select.selectByVisibleText("India");
		
		
		WebElement selectDate=driver.findElements(By.tagName("select")).get(1);
		Select selectdate = new Select(selectDate);
		selectdate.selectByVisibleText("3");
		
		WebElement selectMonth=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select selectmonth = new Select(selectMonth);
		selectmonth.selectByVisibleText("Feb");
		
		WebElement selectYear=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select selectyear = new Select(selectYear);
		selectyear.selectByIndex(2);
		
		List<WebElement> radioButtons = driver.findElements(By.name("gender"));
		radioButtons.get(1).click();
		
		WebElement uname=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		uname.sendKeys("shiwanisinha2@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("shiwani@123");
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
		 
		 
		WebElement cpass=driver.findElement(By.xpath("//*[@id=\"confirm\"]"));
		cpass.sendKeys("shiwani@123");
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
		
		
		WebElement accept=driver.findElement(By.xpath("//*[@id=\"accept\"]"));
		accept.click();
		Thread.sleep(3000);
	
		WebElement btn=driver.findElement(By.xpath("//*[@id=\"signin\"]"));
		btn.submit();

		
		// driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
	}

}
