package progressive_pages;

import static progressive_common.CommonAction.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputPersonalInformation {
	
	
	public InputPersonalInformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_FirstName")
	WebElement fName;
	@FindBy(id= "NameAndAddressEdit_embedded_questions_list_LastName")
	WebElement lName;
	@FindBy(id ="NameAndAddressEdit_embedded_questions_list_DateOfBirth")
	WebElement dateOfBirth;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_MailingAddress")
	WebElement stNumberName;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_ApartmentUnit")
	WebElement apt;
	@FindBy(id ="NameAndAddressEdit_embedded_questions_list_City")
	WebElement cityName;
	@FindBy(id ="NameAndAddressEdit_embedded_questions_list_MailingZipType")
	WebElement poBox;
	@FindBy(xpath = "//button[text()='Okay, start my quote.']")
	WebElement okeyStartMyQoute;
	
	public void inputFirstName(String firstName) {
		input(fName, firstName);
	}
	public void inputLastName(String lastName) {
		input(lName,lastName);
	}
	public void inputDOB(String datefBirth ) {
		input(dateOfBirth,datefBirth);
	}
	public void inputStreetNumber(String stName ) {
		input(stNumberName,stName);
	}
	public void inputApt(String aptNumber ) {
		input(apt,aptNumber);
	}
	public void inputCityName(String city ) {
		input(cityName,city);
	}
	 public void clickPoBox() {
		 click(poBox);
	 }
	 public void clickokeyStartMyQoute() {
		 click(okeyStartMyQoute);
	 }

}
