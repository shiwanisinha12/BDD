package com.capgemini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubLogin {

	WebDriver driver=null;
	
	@Given("^I navigate to (.*)")
	public void goToPage(String link) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\shiwansi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(link);
	}
	
	@And("^I enter the username as (.*)")
	public void enterUsername(String user)throws Throwable
	{
		driver.findElement(By.id("login_field")).sendKeys(user);
		//driver.findElement(By.id("password")).sendKeys("Shiwani12@1996");
	}
	
	@And("^I enter the password as (.*)")
	public void enterPassword(String pass)throws Throwable
	{
		//driver.findElement(By.id("login_field")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	
	@When("^I click on Sign in")
	public void loginIn()throws Throwable
	{
		driver.findElement(By.name("commit")).submit();
	}
	
	@Then("^I should be logged in")
	public void successfulLogin()throws Throwable
	{
		System.out.println("login successfully");
		
		
	}
	
	
	
	@Given("^I click on the image")
	public void onClickImg()throws Throwable
	{
		driver.findElement(By.xpath("//*[@id=\"user-links\"]/li[3]/details/summary/span")).click();
	}
	
	@When("^I click on signout")
	public void onClickSign()throws Throwable
	{
		//driver.findElement(By.cssSelector(".dropdown-item dropdown-signout"))..click();
		driver.findElement(By.xpath("//*[@id=\"user-links\"]/li[3]/details/details-menu/ul/li[10]/form/button")).click();
		
	}
	
	@Then("^I should be logged out")
	public void onLogOut()throws Throwable
	{
		System.out.println("logout");
	}
}
