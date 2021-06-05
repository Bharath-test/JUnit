package org.datas;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo4 extends BaseClass {
	
	
	public Pojo4() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath = "//input[@id='first_name']"),
		@FindBy(xpath = "//input[@name='first_name']")
	})
	
	private WebElement txtFrst;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath ="//input[@id='last_name']"),
		@FindBy(xpath = "//input[@name='last_name']")
		
	})
	
	private WebElement txtLast;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath ="//textarea[@id='address']"),
		@FindBy(xpath ="//textarea[@name='address']")
	})
	
	private WebElement txtAdd;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath ="//input[@id='cc_num']"),
		@FindBy(xpath ="//input[@name='cc_num']")
	})
	
	private WebElement txtCcNo;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath ="//select[@id='cc_type']"),
		@FindBy(xpath ="//select[@name='cc_type']")
		
	})
	
	private WebElement txtCardType;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath ="//select[@id='cc_exp_month']"),
		@FindBy(xpath ="//select[@name='cc_exp_month']")
		
	})
	
	private WebElement txtExpMonth;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath ="//select[@id='cc_exp_year']"),
		@FindBy(xpath ="//select[@name='cc_exp_year']")
		
	})
	
	private WebElement txtExpYr;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath ="//input[@id='cc_cvv']"),
		@FindBy(xpath ="//input[@name='cc_cvv']")
		
	})
	
	private WebElement txtCvv;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath ="//input[@id='book_now']"),
		@FindBy(xpath ="//input[@name='book_now']")
		
	})
	
	private WebElement btnBook;

	public WebElement getTxtFrst() {
		return txtFrst;
	}

	public WebElement getTxtLast() {
		return txtLast;
	}

	public WebElement getTxtAdd() {
		return txtAdd;
	}

	public WebElement getTxtCcNo() {
		return txtCcNo;
	}

	public WebElement getTxtCardType() {
		return txtCardType;
	}

	public WebElement getTxtExpMonth() {
		return txtExpMonth;
	}

	public WebElement getTxtExpYr() {
		return txtExpYr;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}

}
