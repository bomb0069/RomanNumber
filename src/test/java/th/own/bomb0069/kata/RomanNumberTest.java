package th.own.bomb0069.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumberTest {

	RomanNumber romanNumber = new RomanNumber();

	@Test
	public void testBefore4ShouldBeIAtXTime (){
		assertEquals("I", romanNumber.get(1));
		assertEquals("II", romanNumber.get(2));
		assertEquals("III", romanNumber.get(3));
	} 

	@Test
	public void test4ShouldBeReturnIV (){
		assertEquals("IV", romanNumber.get(4));
	} 

	@Test
	public void test5ShouldBeReturnV (){
		assertEquals("V", romanNumber.get(5));
	} 

	@Test
	public void test6To8ShouldBeReturnVPlusIXTime (){
		assertEquals("VI", romanNumber.get(6));
		assertEquals("VII", romanNumber.get(7));
		assertEquals("VIII", romanNumber.get(8));
	} 	

	@Test
	public void test9ShouldBeReturnIX (){
		assertEquals("IX", romanNumber.get(9));
	} 	

	@Test
	public void test10ShouldBeReturnX (){
		assertEquals("X", romanNumber.get(10));
	} 	

	@Test
	public void test11To18ShouldBeReturnXPlusIXTime (){
		assertEquals("XI", romanNumber.get(11));
		assertEquals("XII", romanNumber.get(12));
		assertEquals("XIII", romanNumber.get(13));
		assertEquals("XIV", romanNumber.get(14));
		assertEquals("XV", romanNumber.get(15));
		assertEquals("XVII", romanNumber.get(17));
	} 	

	@Test
	public void test19ShouldBeReturnXIX (){
		assertEquals("XIX", romanNumber.get(19));
	} 	


}