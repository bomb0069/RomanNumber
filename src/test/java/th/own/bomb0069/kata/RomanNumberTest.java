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

	@Test
	public void test3ShouldBeReturnIII (){
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
	public void test6ShouldBeReturnVI (){
		assertEquals("VI", romanNumber.get(6));
	} 	

	@Test
	public void test7ShouldBeReturnVII (){
		assertEquals("VII", romanNumber.get(7));
	} 	

	@Test
	public void test8ShouldBeReturnVIII (){
		assertEquals("VIII", romanNumber.get(8));
	} 	

	@Test
	public void test9ShouldBeReturnIX (){
		assertEquals("IX", romanNumber.get(9));
	} 	

}