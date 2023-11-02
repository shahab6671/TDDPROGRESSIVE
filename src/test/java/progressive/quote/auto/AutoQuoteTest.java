package progressive.quote.auto;

import org.testng.annotations.Test;

import progressive_base.TestBase;

public class AutoQuoteTest extends TestBase {
	
	@Test
	public void getAutoQuoteTest() {
		
		//verifyHomePage.verifyHomePageTitle("PROGRESSIVE");
		verifyHomePage.verifyTitleText("Welcome to Progressive Insurance®");
		//verifyHomePage.verifySubTitleText("Better insurance starts here"); // sub-title isn't dynamic
		verifyHomePage.verifyFootterText("Select a product to quote");
		//verifyHomePage.verifyHomePageTitle("PROGRESSIVE");
		verifyHomePage.clickAuto();
		verifyHomePage.inputZipCodeField("abhcd");
		verifyHomePage.clickGetQuotebt();
		verifyHomePage.verifyErrorMsgText("Please use only digits.");
		verifyHomePage.verifyMaxLength("5");
		verifyHomePage.cleanZipcodeField();
		verifyHomePage.inputZipCodeField("1ab2k");
		verifyHomePage.verifyMaxLength("5");
		verifyHomePage.cleanZipcodeField();
		verifyHomePage.inputZipCodeField("11204");
		verifyHomePage.clickGetQuotebt();
		information.inputFirstName("Roney");
		information.inputLastName("uddin");
		information.inputDOB("01/01/1993");
		information.inputStreetNumber("978 dahill rd");
		information.inputApt("2");
		information.inputCityName("brooklyn");
		information.clickokeyStartMyQoute();

	}

}
