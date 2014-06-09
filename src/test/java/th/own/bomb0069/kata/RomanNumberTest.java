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
/*
	@Test
	public void test20To48 (){
		assertEquals("XXV", romanNumber.get(25));
		assertEquals("XXX", romanNumber.get(30));
		assertEquals("XXXIX", romanNumber.get(39));
		assertEquals("XXXXIV", romanNumber.get(44));
	} 	


	@Test
	public void test49and50and51 (){
		assertEquals("IL", romanNumber.get(49));
		assertEquals("L", romanNumber.get(50));
		assertEquals("LI", romanNumber.get(51));
	} 	

	@Test
	public void test52To98 (){
		assertEquals("LV", romanNumber.get(55));
		assertEquals("LXIV", romanNumber.get(64));
		assertEquals("LXXIX", romanNumber.get(79));
		assertEquals("LXXXXVIII", romanNumber.get(98));
	} 	


	@Test
	public void testCDM (){
		assertEquals("IC", romanNumber.get(99));
		assertEquals("C", romanNumber.get(100));
		assertEquals("CI", romanNumber.get(101));

		assertEquals("ID", romanNumber.get(499));
		assertEquals("D", romanNumber.get(500));
		assertEquals("DI", romanNumber.get(501));

		assertEquals("IM", romanNumber.get(999));
		assertEquals("M", romanNumber.get(1000));
		assertEquals("MI", romanNumber.get(1001));
	} 	

*/
}