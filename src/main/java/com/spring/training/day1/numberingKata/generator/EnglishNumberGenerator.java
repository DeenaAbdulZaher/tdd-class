package com.spring.training.day1.numberingKata.generator;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.training.day1.numberingKata.container.NumberContainer;


/**
 * The Class EnglishNumberGenerator.
 */
public class EnglishNumberGenerator implements NumberGenerator {

	/** The number container. */
	@Autowired
	private NumberContainer numberContainer;

	/**
	 * Instantiates a new english number generator.
	 */
	public EnglishNumberGenerator() {
//		this.numberContainer = new EnglishNumberContainer();
	}

	/**
	 * formalize the number.
	 *
	 * @param intNumber the int number
	 * @return the string
	 */
	@Override
	public String generateNumber(int intNumber) {
		if (intNumber < 100)
			return (intNumber <= 20) ? numberContainer
					.getNumberInWords(intNumber) : numberContainer
					.getNumberInWords((intNumber / 10) * 10)
					+ " "
					+ numberContainer.getNumberInWords(intNumber % 10);
		else if (intNumber >= 100 && intNumber < 1000)
			return this.numberContainer.getNumberInWords((intNumber / 100))
					.trim()
					+ " handred "
					+ this.generateNumber(intNumber % 100).trim();
		else if (intNumber >= 1000 && intNumber < 1000000)
			return this.generateNumber((intNumber / 1000)).trim()
					+ " thousand "
					+ this.generateNumber(intNumber % 1000).trim();
		else if (intNumber >= 1000000 && intNumber < 1000000000)
			return this.generateNumber((intNumber / 1000000)).trim()
					+ " million "
					+ this.generateNumber(intNumber % 1000000).trim();
		else
			return this.generateNumber((intNumber / 1000000000)).trim()
					+ " billion "
					+ this.generateNumber(intNumber % 1000000000).trim();
	}
}