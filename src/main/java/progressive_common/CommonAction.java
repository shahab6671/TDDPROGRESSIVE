package progressive_common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import progressive_reports.Loggers;

public class CommonAction {

	public static void input(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + "......Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			Loggers.log(element + "...not found\n" + e.getMessage());
			Assert.fail();
		}
	}

	public static void inputThrowsNoSuchElementrException(WebElement element, String inputValue)
			throws NoSuchElementException {
		element.sendKeys(inputValue);
		Loggers.log(element + "......Input value: " + inputValue);
	}

	public static void click(WebElement element) {
		try {
			element.click();
			Loggers.log(element + "......Clicked: ");
		} catch (NoSuchElementException e) {
			Loggers.log(element + "...not found\n" + e.getMessage());
			Assert.fail();
		}
	}

	public static void clickThrowsNoSuchElementException(WebElement element) {
		element.click();
		Loggers.log(element + "......Clicked: ");
	}

	public static void inputFirstName(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + "......Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			Loggers.log(element + "...not found\n" + e.getMessage());
			Assert.fail();
		}

	}

	public static void inputLastName(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + "......Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			Loggers.log(element + "...not found\n" + e.getMessage());
			Assert.fail();
		}
	}

	public static void inputDateOfBirth(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + "......Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			Loggers.log(element + "...not found\n" + e.getMessage());
			Assert.fail();
		}
	}
	
	public static void inputStNumberName(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + "......Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			Loggers.log(element + "...not found\n" + e.getMessage());
			Assert.fail();
		}

	}

	public static void inputApt(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + "......Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			Loggers.log(element + "...not found\n" + e.getMessage());
			Assert.fail();
		}

	}

	public static void inputCityName(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + "......Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			Loggers.log(element + "...not found\n" + e.getMessage());
		}

	}

	public static void inputPoBox(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + "......Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			Loggers.log(element + "...not found\n" + e.getMessage());
		}

	}

	public static void clickOkeyStartMyQuote(WebElement element) {
		try {
			element.click();
			Loggers.log(element + "......clicked");
		} catch (NoSuchElementException e) {
			Loggers.log(element + "...not found\n" + e.getMessage());
		}
	}
}
