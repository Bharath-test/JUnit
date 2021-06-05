package org.base;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static Actions a;

	public static Select s;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumClass10Am\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {

		driver.get(url);
	}

	public static void maxBrowser() {

		driver.manage().window().maximize();
	}
	
	public static void CloseBrowser() {
		
		driver.close();
	}

	public static void fill(WebElement element, String name) {

		element.sendKeys(name);
	}

	public static  String printTitle() {

		String title = driver.getTitle();
		System.out.println(title);
		
		return title;
	}

	public static void toPerformDropDownSelectTx(WebElement element, String name) {

		s = new Select(element);

		s.selectByVisibleText(name);

	}

	public static void btnClk(WebElement element) {

		element.click();

	}

	public static void btnsub(WebElement element) {

		element.submit();
	}

	public static String toPerformGetAtt(WebElement element, String value) {

		String attribute = element.getAttribute(value);
		System.out.println(attribute);

		return attribute;

	}

	public static String excelRead(int rowNo, int cellNo) throws IOException {

		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Frame5.00\\data\\Data1.xlsx");

		FileInputStream f = new FileInputStream(file);

		Workbook w = new XSSFWorkbook(f);

		Sheet s = w.getSheet("Sheet1");

		Row r = s.getRow(rowNo);

		Cell c = r.getCell(cellNo);

		int cellType = c.getCellType();

		String value = "";

		if (cellType == 1) {

			value = c.getStringCellValue();
		}

		else if (DateUtil.isCellDateFormatted(c)) {

			Date d = c.getDateCellValue();

			SimpleDateFormat S = new SimpleDateFormat("dd-mm-yyyy");

			value = S.format(d);

		}

		else {

			double dd = c.getNumericCellValue();

			long l = (long) dd;

			value = String.valueOf(l);
		}

		return value;

	}

}
