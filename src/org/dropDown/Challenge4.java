package org.dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Challenge4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Deepak\\Documents\\DropDown\\drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://demo.guru99.com/test/newtours/register.php");
		d.manage().window().maximize();
		WebElement contry = d.findElement(By.xpath("//select[@name='country']"));
		Select s = new Select(contry);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement con = options.get(i);
			String text = con.getText();
			System.out.println(text);
		}
	}

}
