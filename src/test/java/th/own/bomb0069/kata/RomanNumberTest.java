package th.own.bomb0069.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumberTest {
	
	@Test
	public void test1ShouldBeReturnI (){
		RomanNumber romanNumber = new RomanNumber();
		String actualString = romanNumber.get(1);
		assertEquals("I", actualString);
	} 
}