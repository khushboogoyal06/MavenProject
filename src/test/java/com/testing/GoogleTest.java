package com.testing;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {
	@Test
	public void google(){
		WebDriver dr=new FirefoxDriver();
		dr.get("https://yahoo.com");
	}

}
