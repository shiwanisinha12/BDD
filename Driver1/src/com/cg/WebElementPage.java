package com.cg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebElementPage {

	@FindBy(id="lst-ib")
	public static WebElement search;
	
	@FindBy(how=How.LINK_TEXT,using="Images")
	public static WebElement iLink;
	
	@FindBy(tagName="img")
	public static WebElement imageLink;
	
	@FindBy(how=How.CSS,using="a[class = rg_l]")
	public static WebElement imgElement;
}
