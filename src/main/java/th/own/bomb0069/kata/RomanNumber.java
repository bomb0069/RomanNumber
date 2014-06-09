package th.own.bomb0069.kata;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class RomanNumber {

	List<Integer> romanNumbers = Arrays.asList(1000,500,100,50,10,5,1);
	static Map<Integer,String> romanChar = new HashMap<Integer,String>();
	static {
		romanChar.put(1,"I");
		romanChar.put(5,"V");
		romanChar.put(10,"X");
		romanChar.put(50,"L");
		romanChar.put(100,"C");
		romanChar.put(500,"D");
		romanChar.put(1000,"M");
	}

	public String get(int number) {
		String romanNumber = "";

		for (Integer romanNo : romanNumbers) {
			while ((number != 0) && (number >= romanNo - 1)) {
				if (number == romanNo - 1) {
					romanNumber+= "I" + romanChar.get(romanNo);
					number = 0;
				} else if (number >= romanNo) {
					romanNumber+= romanChar.get(romanNo);
					number -= romanNo;
				}
			}
		}

		return romanNumber;
	}
	
}