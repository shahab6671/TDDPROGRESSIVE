package progressive_pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static progressive_common.CommonAction.*;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id ="zipCode_mma")
     WebElement zipCodeField;	
	@FindBy(xpath = ("//input[@id='qsButton_mma']"))
	WebElement getQuot;
	
	public void inputZipCode(String zipcode) {
		input(zipCodeField, zipcode);
	}
	
	public void clickGetQuote() {
	click(getQuot);
	
		
	}
	 
	

}
