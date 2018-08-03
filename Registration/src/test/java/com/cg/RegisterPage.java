package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

	WebElement element=null;
	
	@FindBy(id="fname")
	WebElement firstname;
	
	@FindBy(id="lname")
	WebElement lastname;
	
	@FindBy(id="email")
 WebElement emailaddress;
	
	@FindBy(id="contact")
	WebElement contact;
	
	@FindBy(name="address")
	WebElement address;
	
	@FindBy(name="cities")
	WebElement city;
	
	//@FindBy(id="state")
	//public static WebElement state;
	
	@FindBy(id="btn")
	WebElement register;
	
	@FindBy(id="pname")
	 WebElement projectName;
	
	@FindBy(id="cname")
	WebElement clientName;

	@FindBy(id="button")
	 WebElement button;
	
}
