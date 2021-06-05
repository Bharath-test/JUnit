package org.datas;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ExecutableClass1 extends BaseClass {
	
	

	public static void main(String[] args) throws IOException {
		
		launchBrowser();
		loadUrl("https://adactinhotelapp.com/");
		maxBrowser();
		
		
		
		Pojo1 p1 = new Pojo1();
		Pojo2 p2 = new Pojo2();
		Pojo3 p3 = new Pojo3();
		Pojo4 p4 = new Pojo4();
		
		fill(p1.getTxtUser(), excelRead(1, 0));
		fill(p1.getTxtPass(), excelRead(1, 1));
		btnClk(p1.getBtnClick());
		
		WebElement txtLoc = driver.findElement(By.id("location"));
		toPerformDropDownSelectTx(txtLoc,"Brisbane");
		
		WebElement txtHot = driver.findElement(By.id("hotels"));
		toPerformDropDownSelectTx(txtHot, "Hotel Sunshine");
		
		WebElement txtRoom = driver.findElement(By.id("room_type"));
		toPerformDropDownSelectTx(txtRoom, "Standard");
		
		WebElement txtRoomNo = driver.findElement(By.id("room_nos"));
		toPerformDropDownSelectTx(txtRoomNo, "2 - Two");
		
		fill(p2.getTxtCheckIn(), excelRead(1, 2));
		fill(p2.getTxtCheckout(), excelRead(1, 3));
		btnsub(p2.getBtnClick());	
		
		btnClk(p3.getBtnClck());
		btnClk(p3.getBtnsbmt());
		
		fill(p4.getTxtFrst(), excelRead(1, 4));
		fill(p4.getTxtLast(), excelRead(1, 5));
		fill(p4.getTxtAdd(), excelRead(1, 6));
		fill(p4.getTxtCcNo(), excelRead(1, 7));
		fill(p4.getTxtCardType(), excelRead(1, 8));
		fill(p4.getTxtExpMonth(), excelRead(1, 9));
		fill(p4.getTxtExpYr(), excelRead(1, 10));
		fill(p4.getTxtCvv(), excelRead(1, 11));
		btnClk(p4.getBtnBook());
		
		WebElement orderid = driver.findElement(By.id("//input[@id='order_no']"));
		
		toPerformGetAtt(orderid, "value");
		
		
		
		
		
		
		
		
	}

}
