package th.own.bomb0069.kata;

public class RomanNumber {

	public String get(int number) {
		String romanNumber = "";

		if (number == 9)
			return "IX";

		if (number >= 10) {
			romanNumber+= "X";
			number -= 10;
		}

		if (number == 4)
			return "IV";

		if (number >= 5) {
			romanNumber+= "V";
			number -= 5;
		}

		for (int loopNum = 1 ; loopNum <= number; loopNum++)
			romanNumber+= "I";

		return romanNumber;
	}
	
}