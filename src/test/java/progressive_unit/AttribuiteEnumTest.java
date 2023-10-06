package progressive_unit;

import org.testng.annotations.Test;

import progressive_constants.Attribute;


public class AttribuiteEnumTest {
	@Test
	public void attribuiteEnumTest() {
		System.out.println(Attribute.MAX_LENGTH);
		System.out.println(Attribute.MAX_LENGTH.toString());
		System.out.println(Attribute.MAX_LENGTH.name());
		System.out.println(Attribute.MAX_LENGTH.getAttributes());
		
	}

}
