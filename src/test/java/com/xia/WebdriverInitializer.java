package com.xia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverInitializer {

	private static WebDriver driver;

	public static WebDriver getWebdriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/cheehonghsia/tools/chromedriver");
		driver = new ChromeDriver();
		return driver;
	}
}
