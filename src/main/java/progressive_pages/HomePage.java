package progressive_pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import static progressive_common.CommonAction.*;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "zipCode_mma")
	WebElement zipCodeField;
	@FindBy(xpath = ("//input[@id='qsButton_mma']"))
	WebElement getQuot;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_FirstName")
	WebElement firstName;
	@FindBy(id= "NameAndAddressEdit_embedded_questions_list_LastName")
	WebElement lastName;
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
	@FindBy(xpath = "//a[@data-tracking-label='auto_section']")
	WebElement autoLobElement;
	@FindBy(id = "zipCode_overlay")
	WebElement zipCodeAltElement;
	@FindBy(id = "qsButton_overlay")
	WebElement getQuoteOverlayElement;

	public void inputZipCode(String zipcode) {
		try {
			inputThrowsNoSuchElementrException(zipCodeField, zipcode);
		}catch (NoSuchElementException e) {
			click(autoLobElement);
			input(zipCodeAltElement, zipcode);
		}
	}

	public void clickGetQuote() {
		try {
			clickThrowsNoSuchElementException(getQuot);
		}catch (NoSuchElementException e) {
			click(getQuoteOverlayElement);
		}
	}
	public void inputFName(String first_name) {
		input(firstName, first_name);
	}
	public void inputLName(String last_name) {
		input(lastName, last_name);
	}
	public void inputBirth(String Date_of_birth) {
		input(dateOfBirth, Date_of_birth);
	}

	public void inputStreetNumberName(String streetNumberName){
		input(stNumberName, streetNumberName);
	}
	public void inputAptNumber(String apt_number) {
		input(apt, apt_number);
	}
	public void input_city_name(String city_name) {
		input(cityName, city_name);
		
	}
	public void click_po_box() {
     click(poBox);		
	}
	
	public void clickStartMyQuote() {
		clickOkeyStartMyQuote(okeyStartMyQoute);
	}
	
	
	
	
	
	
	
	
	
	

}
