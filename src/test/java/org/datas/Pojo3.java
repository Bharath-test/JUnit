package org.datas;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo3 extends BaseClass{
	
	public Pojo3() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath ="//input[@id='radiobutton_0']"),
		@FindBy(xpath = "//input[@name='radiobutton_0']")
		
		})
	
	private WebElement btnClck;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath = "//input[@id='continue']" ),
		@FindBy(xpath = "//input[@name='continue']")
		
		})
	
	private WebElement btnsbmt;

	public WebElement getBtnClck() {
		return btnClck;
	}

	public WebElement getBtnsbmt() {
		return btnsbmt;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
