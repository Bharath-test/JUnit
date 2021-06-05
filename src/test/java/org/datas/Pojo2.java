package org.datas;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo2 extends BaseClass {

	public Pojo2() {

		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindAll({

			@FindBy(xpath = "//select[@id='location']"), 
			@FindBy(xpath = "//select[@name='location']")

	})

	private WebElement txtLoc;

	@CacheLookup
	@FindAll({

			@FindBy(xpath = "//select[@id='hotels']"),
			@FindBy(xpath = "//select[@name='hotels']")

	})

	private WebElement txtHot;

	@CacheLookup
	@FindAll({

			@FindBy(xpath = "//select[@id='room_type']"),
			@FindBy(xpath = "//select[@name='room_type']")
			})

	private WebElement txtRoom;

	@CacheLookup
	@FindAll({

			@FindBy(xpath = "//select[@id='room_nos']"),
			@FindBy(xpath = "//select[@name='room_nos']") 
			})

	private WebElement txtRoomNo;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath = "//input[@id='datepick_in']"),
		@FindBy(xpath = "//input[@name='datepick_in']")
	})
	
	private WebElement txtCheckIn;
	
	@CacheLookup
	@FindAll ({
		
		@FindBy(xpath = "//input[@id='datepick_out']"),
		@FindBy(xpath = "//input[@name='datepick_out']")
	})
	
	private WebElement txtCheckout;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath = "//select[@id='adult_room']"),
		@FindBy(xpath = "//select[@name='adult_room']")
	})
	
	private WebElement txtAdult;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath = "//select[@id='child_room']"),
		@FindBy(xpath = "//select[@name='child_room']")
	})
	
	private WebElement txtCldRm;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath = "//input[@id='Submit']"),
		@FindBy(xpath = "//input[@name='Submit']")
	})
	
	private WebElement btnClick;

	public WebElement getTxtLoc() {
		return txtLoc;
	}

	public WebElement getTxtHot() {
		return txtHot;
	}

	public WebElement getTxtRoom() {
		return txtRoom;
	}

	public WebElement getTxtRoomNo() {
		return txtRoomNo;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckout() {
		return txtCheckout;
	}

	public WebElement getTxtAdult() {
		return txtAdult;
	}

	public WebElement getTxtCldRm() {
		return txtCldRm;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
