package th.own.bomb0069.kata;

import java.util.Map;
import java.util.LinkedHashMap;

public class RomanNumber {

	static Map<Integer,String> romanChar = new LinkedHashMap<Integer,String>();
	static {
		romanChar.put(1000,"M");
		romanChar.put(500,"D");
		romanChar.put(100,"C");
		romanChar.put(50,"L");
		romanChar.put(10,"X");
		romanChar.put(5,"V");
		romanChar.put(1,"I");
	}

	public String get(int number) {
		String romanNumber = "";

		for (Integer romanNo : romanChar.keySet()) {
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