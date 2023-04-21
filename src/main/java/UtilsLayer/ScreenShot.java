package UtilsLayer;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;

public class ScreenShot extends BaseClass {
	
	public static String getScreenShot(String screenShotName)
	{
		TakesScreenshot ts = TakesScreenshot() driver;
		File f =ts.getScreenshotAs(OutputType.FILE);
		String dest =System.getProperty("C:\\Users\\Shree\\eclipse-workspace\\com.patona\\ScreenShots"+screenShotName);
		FileUtils.copyFile(f.new file(dest));
		
		return dest;
		
	}

	
	

}
