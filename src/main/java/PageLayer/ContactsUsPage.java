package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.HandleDropDown;

public class ContactsUsPage extends BaseClass {

	@FindBy(xpath="Companypi_Company")
	WebElement companyName;
	
	@FindBy(id="First_Namepi_First_Name")
	WebElement firstName;
	
	@FindBy(id="Last_Namepi_Last_Name")
	WebElement lastName;
	
	@FindBy(id="Emailpi_Email")
	WebElement work_emailid;
	
	@FindBy(id="941293_138982pi_941293_138982")
	WebElement phone_no;
	
	@FindBy(id="941293_138980pi_941293_138980")
	WebElement country_drpdown;
	
	@FindBy(id="941293_138986pi_941293_138986")
	WebElement enquiry_details;
	
	@FindBy(id="941293_178033pi_941293_178033")
	WebElement how_did_you_heard;
	
	@FindBy(xpath="//input[@id='941293_139028pi_941293_139028_631736']")
	WebElement checkBox;
	
	public ContactsUsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void contactUsPage(String cName,String fname,String lname,String mailid,String enqdet,String  phnum)
	{
		companyName.sendKeys(cName);
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		work_emailid.sendKeys(mailid);
		phone_no.sendKeys(phnum);
		enquiry_details.sendKeys(enqdet);
		checkBox.click();

	}
	
	public String selectCountry(String country)
	{
		HandleDropDown.handleDPByVisibleText(country_drpdown, country);
		return HandleDropDown.checkSelectedValueFromDP(country_drpdown);
		
	}
	
	public String howDidYouHeardAbourUs(String opt)
	{
		HandleDropDown.handleDPByVisibleText(how_did_you_heard, opt);
		return HandleDropDown.checkSelectedValueFromDP(how_did_you_heard);
	}
	
	

	
	}


