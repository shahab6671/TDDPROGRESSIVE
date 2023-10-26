package progressive.quote.auto;

import org.testng.annotations.Test;

import progressive_base.TestBase;

public class AutoQuoteTest extends TestBase {
	@Test
	public void getAutoQuoteTest() {
   
	    homePage.verifyTitleText("Welcome to Progressive Insurance®");
		//homePage.verifySubTitleText("Better insurance starts here"); //sub-title isn't dynamic
		homePage.verifyFootterText("Select a product to quote");
		//homePage.verifyHomePageTitle("PROGRESSIVE");
		homePage. clickAuto();
		homePage.inputZipCodeField("abhcd");
		homePage.clickGetQuotebt();
		homePage.verifyErrorMsgText("Please use only digits.");
		//homePage.verifyMaxLength("5");
		homePage.cleanZipcodeField();
		homePage.inputZipCodeField("1ab2k");
		homePage.verifyMaxLength("5");
		homePage.cleanZipcodeField();
		homePage.inputZipCodeField("11204");
		homePage.clickGetQuotebt();
		homePage.inputFirstName("Roney");
		homePage.inputLastName("uddin");
		homePage.inputDOB("01/01/1993");
		homePage.inputStreetNumber("978 dahill rd");
		homePage.inputApt("2");
		homePage.inputCityName("brooklyn");
		homePage.clickGetQuotebt();
		homePage.clickokeyStartMyQoute();
		
		
		/*
		homePage.inputZipCode("11204");
		homePage.clickGetQuote();
		homePage.inputFName("Shahab");
		homePage.inputLName("Uddin");
		homePage.inputBirth("01/01/1993");
		homePage.inputStreetNumberName("978 Dahill rd");
		homePage.inputAptNumber("2");
		homePage.input_city_name("brooklyn");
		homePage.click_po_box();
		homePage.clickStartMyQuote();
		*/
	}
	

}
