package progressive_common;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

import progressive_reports.Loggers;

public class CommonAction {
	
	public static void input(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + "......Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			Loggers.log(element + "...not found\n" + e.getMessage());
		}
		
	}
	
	public static void click(WebElement element) {
		try {
			element.click();
			Loggers.log(element + "......Clicked: " );
		} catch (NoSuchElementException e) {
			Loggers.log(element + "...not found\n" + e.getMessage());
		}
		
	}

}
