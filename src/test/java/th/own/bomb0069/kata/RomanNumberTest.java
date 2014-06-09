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

	@Test
	public void test20To48 (){
		assertEquals("XXV", romanNumber.get(25));
		assertEquals("XXX", romanNumber.get(30));
		assertEquals("XXXIX", romanNumber.get(39));
	} 	

	@Test
	public void test40ShouldBeXL (){
		assertEquals("XL", romanNumber.get(40));
		assertEquals("XLIV", romanNumber.get(44));
		assertEquals("XLV", romanNumber.get(45));
		assertEquals("XLVI", romanNumber.get(46));
		assertEquals("XLIX", romanNumber.get(49));
	} 	

	@Test
	public void test50and51 (){
		assertEquals("L", romanNumber.get(50));
		assertEquals("LI", romanNumber.get(51));
	} 	

	@Test
	public void test52To89 (){
		assertEquals("LV", romanNumber.get(55));
		assertEquals("LXIV", romanNumber.get(64));
		assertEquals("LXXIX", romanNumber.get(79));
	} 	

	@Test
	public void test90and91 (){
		assertEquals("XC", romanNumber.get(90));
		assertEquals("XCI", romanNumber.get(91));
	} 	


	@Test
	public void testCDM (){
		assertEquals("C", romanNumber.get(100));
		assertEquals("CI", romanNumber.get(101));

		assertEquals("CD", romanNumber.get(400));
		assertEquals("CDI", romanNumber.get(401));

		assertEquals("D", romanNumber.get(500));
		assertEquals("DI", romanNumber.get(501));

		assertEquals("CM", romanNumber.get(900));
		assertEquals("CMI", romanNumber.get(901));

		assertEquals("M", romanNumber.get(1000));
		assertEquals("MI", romanNumber.get(1001));
	} 	


}