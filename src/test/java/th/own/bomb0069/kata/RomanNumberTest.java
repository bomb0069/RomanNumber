package th.own.bomb0069.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumberTest {

	RomanNumber romanNumber = new RomanNumber();

	@Test
	public void test1ShouldBeReturnI (){
		assertEquals("I", romanNumber.get(1));
	} 

	@Test
	public void test2ShouldBeReturnII (){
		assertEquals("II", romanNumber.get(2));
	} 

}