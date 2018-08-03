package com.cg;

import static org.junit.Assert.assertEquals;

import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PerformTest {

	WebDriver driver;
	RegisterPage page;
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\shiwansi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new  ChromeDriver();
		driver.get("D:\\BDD\\Registration\\src\\main\\webapp\\Register.html");
		page=PageFactory.initElements(driver, RegisterPage.class);
		
		
	
	
	}
	
	@Given("^I enter the firstname as (.*) and lastname as (.*)$")
	public void i_enter_the_firstname_as_Shiwani_and_lastname_as_Sinha(String str1,String str2) throws Throwable {
		page.firstname.sendKeys(str1);
		Thread.sleep(1000);
		page.lastname.sendKeys(str2);
		Thread.sleep(1000);
	}

	@And("^I enter the email address as (.*)$")
	public void i_enter_the_email_address_as_Shiwani_gmail_com(String arg1) throws Throwable {
	    
	page.emailaddress.sendKeys(arg1);
	Thread.sleep(1000);
	   
	}

	@And("^I enter my contact number as (\\d+)$")
	public void i_enter_my_contact_number_as(String arg) throws Throwable {
	
		page.contact.sendKeys(arg);
		Thread.sleep(1000);
	  
	}
	@And("^I enter the address as (.*) and city as (.*)$")
	public void i_enter_the_address_as_Infotech_Park_and_city_as_Pune(String str1,String str2) throws Throwable {
		page.address.sendKeys(str1);
		Thread.sleep(1000);
	    page.city.sendKeys(str2);
	    Thread.sleep(1000);
	 
	}

	@And("^I select the state$")
	public void i_select_team_size() throws Throwable {
		WebElement selectState=driver.findElement(By.id("state"));
		Select state = new Select(selectState);
		state.selectByIndex(2);
		Thread.sleep(1000);
	   
	}

	@When("^I click on register$")
	public void i_click_on_register() throws Throwable {
	   page.register.click();
	   
	   
	}

	@Then("^I get a message and then I am directed to project page$")
	public void i_get_a_message_and_then_I_am_directed_to_project_page() throws Throwable {
	
		
		driver.get("D:\\BDD\\Registration\\src\\main\\webapp\\Project.html");
		page=PageFactory.initElements(driver, RegisterPage.class);
		 page.projectName.sendKeys("PaymentGateway");
		 Thread.sleep(1000);
		   page.clientName.sendKeys("Barclays");
		   Thread.sleep(1000);
		    WebElement selectTeam=driver.findElement(By.id("team"));
			Select team = new Select(selectTeam);
			team.selectByIndex(2);
			Thread.sleep(1000);
	    
	}

	

	@And("^I am registered$")
	public void i_am_registered() throws Throwable {
	   page.button.click();
	    Alert alert=driver.switchTo().alert();
	    assertEquals("Registration Successful", alert.getText());
	    Thread.sleep(1000);
	    driver.quit();
	}
	
}
