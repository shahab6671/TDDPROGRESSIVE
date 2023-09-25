package progressive.quote.auto;

import org.testng.annotations.Test;

import progressive_base.TestBase;

public class AutoQuoteTest extends TestBase {
	@Test
	public void getAutoQuoteTest() {
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
	}
	

}
