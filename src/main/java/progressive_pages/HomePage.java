package progressive_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import progressive_constants.Attribute;

import static progressive_common.CommonAction.*;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='intro centered']/h1")
	WebElement titleText;
	@FindBy(xpath = "//p[text()='Take a road trip to Savingsville']")
	WebElement subTitleText;
	@FindBy(css = ".copy.h4-style.centered")
	WebElement footterText;
	@FindBy(xpath= "(//p[@class='text block-link is-simple bounce'])[3]")
	WebElement auto;
	@FindBy(xpath = "//input[@id='zipCode_overlay']")
	WebElement zipCodeField;
	@FindBy(xpath = ("//input[@id='qsButton_mma']"))
	WebElement getQuot;
	@FindBy()
	WebElement maxLength;
	@FindBy(xpath ="//span[@id='zipCode_overlay-error']")
	WebElement errorMsgText;
	
	@FindBy(xpath = "//a[@class='logo']")
	WebElement homePageText;
	
	public void verifyTitleText(String expectedString ) {
          verifyText(titleText, expectedString);		
		//verifyAttribute(titleText, expectedString, Attribute.INNER_HTML);
	}
	
	public void verifySubTitleText(String expectedString ) {
		//verifyText(subTitleText, expectedString);
		verifyAttribute(subTitleText, expectedString, Attribute.INNER_HTML);
	
	}
	public void verifyFootterText(String expectedString) {
		//verifyText(footterText, expectedString);
		verifyAttribute(footterText, expectedString, Attribute.INNER_HTML);
	}
	 public void clickAuto() {
		 click(auto);
	 }
	public void inputZipCodeField(String zipCode) {
		input(zipCodeField, zipCode);
	}
	public void verifyErrorMsgText(String expectedString ) {
		verifyText(errorMsgText, expectedString);
		//verifyAttribute(errorMsgText, expectedString, Attribute.INNER_HTML);
	}
	public void verifyMaxLength(String expected) {
		//String actualLength =getAttibuiteValue(zipCodeField, Attribute.max_length);
		verifyAttribute(zipCodeField, expected, Attribute.MAX_LENGTH);
	}
	/*
	public void verifyHomePageTitleText(WebDriver driver, String expectedTitle) {
		verifyTitle(driver, expectedTitle);
		//verifyAttribute(homePageText, expectedTitle, Attribute.INNER_HTML);
	}
	*/
	public void clickGetQuotebt() {
		click(getQuot);
	}
	public void cleanZipcodeField() {
		clear(zipCodeField);
	}

	/*
	public void inputZipcodeField(int zipCode) {
		input(zipCodeField, String.valueOf(zipCode));
	}
	*/
	
	

	public void verifyHomePageTitle(String expected) {
	verifyText(homePageText, expected);	
	}
	

}
