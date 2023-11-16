package org.dropDown;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge5 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Deepak\\Documents\\DropDown\\drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("http://adactinhotelapp.com/");
		d.manage().window().maximize();
		TakesScreenshot ts =(TakesScreenshot) d;
		File pay = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Deepak\\Documents\\DropDown\\screenShot\\pay.png");
		FileUtils.copyFile(pay, f);
	}

}
