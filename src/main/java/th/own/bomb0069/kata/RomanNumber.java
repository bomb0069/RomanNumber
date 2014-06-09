package th.own.bomb0069.kata;

public class RomanNumber {

	public String get(int number) {
		String romanNumber = "";
		for (int loopNum = 1 ; loopNum <= number; loopNum++)
			romanNumber+= "I";

		return romanNumber;

	}
	
}