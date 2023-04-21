package contactUsPageTest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.ContactsUsPage;
import UtilsLayer.ScreenShot;

public class ContactUsPage extends BaseClass {
	
	@BeforeTest
	public void setup()
	{
		BaseClass.intialization();
	}
	
	@Test(priority=1)
	public void validateContactUspage()
	{
		ContactsUsPage cont= new ContactsUsPage();
		cont.contactUsPage("patona", "amol", "kumbhar", "user@gmail.com", "asdkjoweiflfaf", "9685124322");
		
	}
	
	@Test(priority=2)
	public void validateCountryDrpDwn()
	{
		ContactsUsPage drp =new ContactsUsPage();
		String selcontry=drp.selectCountry("India");
		Assert.assertEquals(selcontry, "India");
	}
	
	@Test(priority=3)
	public void validateherdaboutDrpDwn()
	{
		ContactsUsPage drp =new ContactsUsPage();
		String heardabout=drp.howDidYouHeardAbourUs("Social Media");
		Assert.assertEquals(heardabout, "Social Media");
	
	
	}
	
	@Test(priority=4)
	public void screenShot()
	{
		ScreenShot sc = new ScreenShot();
		sc.getScreenShot("Abc1");	
	}
	
	@AfterTest()
	public void tearDown()
	{
		driver.close();
	}
	
	
	
}
