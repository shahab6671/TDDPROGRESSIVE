package progressive_base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import progressive_constants.KeyConfig;
import progressive_pages.InputPersonalInformation;
import progressive_pages.VerifyHomePage;
import progressive_pages.VerifyList;
import progressive_utils.ReadConfig;

import static progressive_constants.Ibrowser.*;

import java.time.Duration;

public class TestBase {

	public static WebDriver driver;
	ReadConfig config;
	protected VerifyHomePage verifyHomePage;
	protected InputPersonalInformation information;
	protected VerifyList list;

	@BeforeSuite
	public void beforeSuiteSetUp() {
		config = new ReadConfig();

	}
    // browser parameter will come from testng suite or runtime
	// @Optional("chrome") will take care in case we miss browser param value
	@Parameters(BROWSER)
	@BeforeMethod
	public void setUpDrive(@Optional (CHROME) String browserName) {
		WebDriverManager.chromiumdriver().setup();
		driver = initializingBrowser(browserName);
		driver.manage().window().maximize();
		int pageLoadTime = Integer.parseInt(config.getValue(KeyConfig.pageLoadTime));
		int implicitWaitTime = Integer.parseInt(config.getValue(KeyConfig.impliciteWaitLoad));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitTime));
		driver.get(config.getValue(KeyConfig.url));
		initObjectClass();

	}

	public WebDriver initializingBrowser(String browserName) {
		switch (browserName) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		case EDGE:
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
		default:
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();

		}

	}

	public void initObjectClass() {
		verifyHomePage = new VerifyHomePage(driver);
		information =new InputPersonalInformation(driver);
		list = new VerifyList(driver);
	}

	@AfterMethod
	public void tearUp() {
	//driver.quit();
	}

}
