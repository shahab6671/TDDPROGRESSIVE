package progressive.quote.auto;

import org.testng.annotations.Test;

import progressive_base.TestBase;

public class AutoQuoteTest extends TestBase {
	@Test
	public void getAutoQuoteTest() {
		homePage.inputZipCode("11204");
		homePage.clickGetQuote();
	}
	

}
