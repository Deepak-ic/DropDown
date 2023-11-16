package org.dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Challenge2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Deepak\\Documents\\DropDown\\drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://en-gb.facebook.com/");
		d.manage().window().maximize();
		WebElement crt = d.findElement(By.xpath("//a[text()='Create new account']"));
		crt.click();
		Thread.sleep(3000);
		WebElement mon = d.findElement(By.xpath("//select[@title='Month']"));
		Select s = new Select(mon);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement yrs = options.get(i);
			String text = yrs.getText();
			System.out.println(text);
		}
	}

}
