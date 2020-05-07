package com.myntra.util;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {

	public static WebDriver driver;

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\\\cg-automation-testing\\\\Selenium\\\\driver\\\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(
				"https://www.myntra.com/login/password?referer=https%3A%2F%2Fwww.myntra.com%2F&mobile=2345234435&show=false");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public String getExcelData(String path, String sheetname, int row, int cell)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(
				"E:\\cg-automation-testing\\com.capgemini.cucumber\\ExcelData\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

}