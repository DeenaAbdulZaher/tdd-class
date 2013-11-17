package com.spring.training.day1.numberingKata.container;

import java.util.HashMap;
import java.util.Map;

/**
 * return the number in English words.
 *
 * @author tdph5945
 */
public class EnglishNumberContainer implements NumberContainer {

	/** The numbers hash. */
	private static Map<Integer, String> numbersHash = new HashMap<Integer, String>();

	static {
		numbersHash.put(0, "");
		numbersHash.put(1, "one");
		numbersHash.put(2, "two");
		numbersHash.put(3, "three");
		numbersHash.put(4, "four");
		numbersHash.put(5, "five");
		numbersHash.put(6, "six");
		numbersHash.put(7, "seven");
		numbersHash.put(8, "eight");
		numbersHash.put(9, "nine");
		numbersHash.put(10, "ten");

		numbersHash.put(11, "eleven");
		numbersHash.put(12, "twelve");
		numbersHash.put(13, "thirteen");

		numbersHash.put(14, "fourteen");
		numbersHash.put(15, "fifteen");
		numbersHash.put(16, "sixteen");
		numbersHash.put(17, "seventeen");

		numbersHash.put(18, "eighteen");

		numbersHash.put(19, "nineteen");

		numbersHash.put(20, "twenty");
		numbersHash.put(30, "thirty");
		numbersHash.put(40, "forty");
		numbersHash.put(50, "fifty");
		numbersHash.put(60, "sixty");
		numbersHash.put(70, "seventy");
		numbersHash.put(80, "eighty");
		numbersHash.put(90, "ninety");
	}

	/* (non-Javadoc)
	 * @see com.spring.training.day1.numberingKata.NumberContainer#getNumber(int)
	 */
	@Override
	public String getNumberInWords(int intVal) {
		String strVal ;
		return ( strVal = numbersHash.get(intVal) ) == null ? "" : strVal;
	}
}
