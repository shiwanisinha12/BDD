package com.cg;

import java.io.FileReader;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import au.com.bytecode.opencsv.CSVReader;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class CsvReaderTest {
	
	String file="D:\\tests.csv";
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\shiwansi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("D:\\BDD\\CsvDemo\\src\\main\\webapp\\Form.html");
	}
	
	@Given("^I am sending details")
	public void sendDetails() throws Throwable
	{
		CSVReader reader=new CSVReader(new FileReader(file));
		String [] csvCell;
		  while ((csvCell = reader.readNext()) != null) {   
		   String FName = csvCell[0];
		   String LName = csvCell[1];
		  String city = csvCell[2];
		  driver.findElement(By.id("fname")).sendKeys(FName);
		  Thread.sleep(1000);
		  driver.findElement(By.id("lname")).sendKeys(LName);
		  Thread.sleep(1000);
		  driver.findElement(By.id("city")).sendKeys(city);
		  Thread.sleep(1000);
		  driver.findElement(By.id("btn")).click();
		  Thread.sleep(1000);
		  driver.switchTo().alert().accept();
		  Thread.sleep(1000);
	}

}
	
}
