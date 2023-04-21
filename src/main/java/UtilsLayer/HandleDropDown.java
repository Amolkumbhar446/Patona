package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {
	
	
	public static void handleDPByVisibleText(WebElement wb, String value)
	{
		new Select(wb).selectByVisibleText(value); 
	}

	public static String checkSelectedValueFromDP(WebElement wb) {
		return new Select(wb).getFirstSelectedOption().getText();
	}


}
