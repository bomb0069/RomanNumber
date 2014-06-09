package th.own.bomb0069.kata;

public class RomanNumber {

	public String get(int number) {
		String romanNumber = "";
		if (number == 4)
			return "IV";

		for (int loopNum = 1 ; loopNum <= number; loopNum++)
			romanNumber+= "I";

		return romanNumber;
	}
	
}