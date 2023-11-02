package progressive_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static progressive_common.CommonAction.*;


public class VerifyList  {
	public VerifyList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='explore']")
	WebElement explorProducts;
	@FindBy()
	WebElement vehicleList;
	
	public void clickExplorProducts() {
		click(explorProducts);
	}

}
	


