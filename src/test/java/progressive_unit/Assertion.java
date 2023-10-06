package progressive_unit;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
@Test
public void testHardAssert() {
	Assert.assertEquals("10","10");
	System.out.println("after hard assert");
	
}
@Test
public void softAssert() {
 SoftAssert  softAssert= new SoftAssert();
 
 softAssert.assertEquals(true, false);
 softAssert.assertEquals(false, false);
 System.out.println("after soft assert");
 softAssert.assertAll();
}
}
