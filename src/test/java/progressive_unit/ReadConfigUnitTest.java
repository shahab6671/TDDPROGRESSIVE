package progressive_unit;

import org.testng.annotations.Test;

import progressive_constants.KeyConfig;
import progressive_utils.ReadConfig;

public class ReadConfigUnitTest {
	@Test
	public void getPropertiesTest() {
		ReadConfig config = new ReadConfig();
		String urlString = config.getValue(KeyConfig.url);
		System.out.println(urlString);
	}

}

