package org.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class sample extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {

		launchBrowser();
		loadUrl("https://adactinhotelapp.com/");
		maxBrowser();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement txtUser = driver.findElement(By.id("username"));

		fill(txtUser, excelRead(1, 0));

		WebElement txtPass = driver.findElement(By.id("password"));

		fill(txtPass, excelRead(1, 1));

		WebElement btnLogin = driver.findElement(By.id("login"));

		btnClk(btnLogin);

		Thread.sleep(4000);

		WebElement drpDown1 = driver.findElement(By.id("location"));

		toPerformDropDownSelectTx(drpDown1, "Brisbane");

		WebElement drpDown2 = driver.findElement(By.id("hotels"));

		toPerformDropDownSelectTx(drpDown2, "Hotel Creek");

		WebElement drpDown3 = driver.findElement(By.id("room_type"));

		toPerformDropDownSelectTx(drpDown3, "Standard");

		WebElement drpDown4 = driver.findElement(By.id("room_nos"));

		toPerformDropDownSelectTx(drpDown4, "3 - Three");

		WebElement checkInDate = driver.findElement(By.id("datepick_in"));

		fill(checkInDate, excelRead(1, 2));

		WebElement checkOutDate = driver.findElement(By.id("datepick_out"));

		fill(checkOutDate, excelRead(1, 3));

		WebElement drpDown5 = driver.findElement(By.id("adult_room"));

		toPerformDropDownSelectTx(drpDown5, "2 - Two");

		WebElement drpDown6 = driver.findElement(By.id("child_room"));

		toPerformDropDownSelectTx(drpDown6, "1 - One");

		WebElement search = driver.findElement(By.id("Submit"));

		btnClk(search);

		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));

		btnClk(radioBtn);

		WebElement conti = driver.findElement(By.id("continue"));

		btnClk(conti);

		WebElement firstName = driver.findElement(By.id("first_name"));

		fill(firstName, excelRead(1, 4));

		WebElement lastName = driver.findElement(By.id("last_name"));

		fill(lastName, excelRead(1, 5));

		WebElement Add = driver.findElement(By.id("address"));

		fill(Add, excelRead(1, 6));

		WebElement cc = driver.findElement(By.id("cc_num"));

		fill(cc, excelRead(1, 7));

		WebElement ccType = driver.findElement(By.id("cc_type"));

		fill(ccType, excelRead(1, 8));

		WebElement month = driver.findElement(By.id("cc_exp_month"));

		fill(month, excelRead(1, 9));

		WebElement year = driver.findElement(By.id("cc_exp_year"));

		fill(year, excelRead(1, 10));

		WebElement ccvNo = driver.findElement(By.id("cc_cvv"));

		fill(ccvNo, excelRead(1, 11));

		WebElement btnBook = driver.findElement(By.id("book_now"));

		btnClk(btnBook);

		WebElement orderId = driver.findElement(By.xpath("//input[@name='order_no']"));

		toPerformGetAtt(orderId, "value");
	}

}
