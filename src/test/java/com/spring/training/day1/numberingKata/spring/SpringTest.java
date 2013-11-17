package com.spring.training.day1.numberingKata.spring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.training.day1.numberingKata.configuration.NumberNameConfiguration;
import com.spring.training.day1.numberingKata.generator.NumberGenerator;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = NumberNameConfiguration.class)
public class SpringTest {
	
	@Autowired
	private NumberGenerator numberGenerator;
	
	
	@Test
	public void testGenerateNumberUnderTen() {
		assertEquals("one", numberGenerator.generateNumber(1));
		assertEquals("two", numberGenerator.generateNumber(2));
		assertEquals("three", numberGenerator.generateNumber(3));
		assertEquals("four", numberGenerator.generateNumber(4));
		assertEquals("five", numberGenerator.generateNumber(5));
		assertEquals("six", numberGenerator.generateNumber(6));
		assertEquals("seven", numberGenerator.generateNumber(7));
		assertEquals("eight", numberGenerator.generateNumber(8));
		assertEquals("nine", numberGenerator.generateNumber(9));
		assertEquals("ten", numberGenerator.generateNumber(10));
		
	}
	
	
	@Test
	public void testGenerateNumberUnderHundred() {
		assertEquals("twenty one", numberGenerator.generateNumber(21));
		assertEquals("thirty three", numberGenerator.generateNumber(33));
		assertEquals("forty four", numberGenerator.generateNumber(44));
		assertEquals("fifty six", numberGenerator.generateNumber(56));
		assertEquals("sixty three", numberGenerator.generateNumber(63));
		assertEquals("seventy one", numberGenerator.generateNumber(71));
		assertEquals("eighty two", numberGenerator.generateNumber(82));
		assertEquals("ninety nine", numberGenerator.generateNumber(99));
		
		
	}
	
	
	
	@Test
	public void testGenerateNumberUnderThousend() {
		assertEquals("one handred ninety nine", numberGenerator.generateNumber(199));
		assertEquals("two handred thirty three", numberGenerator.generateNumber(233));
		assertEquals("three handred forty four", numberGenerator.generateNumber(344));
		assertEquals("four handred fifty six", numberGenerator.generateNumber(456));
		assertEquals("five handred sixty three", numberGenerator.generateNumber(563));
		assertEquals("six handred seventy one", numberGenerator.generateNumber(671));
		assertEquals("seven handred eighty two", numberGenerator.generateNumber(782));
		assertEquals("eight handred ninety nine", numberGenerator.generateNumber(899));
		assertEquals("nine handred seventy one", numberGenerator.generateNumber(971));
		
	}
	
	@Test
	public void testGenerateNumberUnderMillion() {
		assertEquals("one thousand one handred ninety nine", numberGenerator.generateNumber(1199));
		assertEquals("one handred ninety nine thousand one handred ninety nine", numberGenerator.generateNumber(199199));
		assertEquals("two handred thirty three thousand two handred thirty three", numberGenerator.generateNumber(233233));
		assertEquals("three handred forty four thousand three handred forty four", numberGenerator.generateNumber(344344));
		assertEquals("four handred fifty six thousand four handred fifty six", numberGenerator.generateNumber(456456));
		assertEquals("five handred sixty three thousand five handred sixty three", numberGenerator.generateNumber(563563));
		assertEquals("six handred seventy one thousand six handred seventy one", numberGenerator.generateNumber(671671));
		assertEquals("seven handred eighty two thousand seven handred eighty two", numberGenerator.generateNumber(782782));
		assertEquals("eight handred ninety nine thousand eight handred ninety nine", numberGenerator.generateNumber(899899));
		assertEquals("nine handred seventy one thousand nine handred seventy one", numberGenerator.generateNumber(971971));
		
	}
	
	@Test
	public void testGenerateNumberUnderBillion() {
		assertEquals("one handred ninety nine million one handred ninety nine thousand one handred ninety nine", numberGenerator.generateNumber(199199199));
		assertEquals("two handred thirty three million two handred thirty three thousand two handred thirty three", numberGenerator.generateNumber(233233233));
		assertEquals("three handred forty four million three handred forty four thousand three handred forty four", numberGenerator.generateNumber(344344344));
		
	}
	@Test
	public void testGenerateNumberUnderTenBillion() {
		assertEquals("one billion one handred ninety nine million one handred ninety nine thousand one handred ninety nine", numberGenerator.generateNumber(1199199199));
		assertEquals("two billion one handred million", numberGenerator.generateNumber(2100000000));
		assertEquals("one billion two handred thirty three million two handred thirty three thousand two handred thirty three", numberGenerator.generateNumber(1233233233));
		assertEquals("one billion three handred forty four million three handred forty four thousand three handred forty four", numberGenerator.generateNumber(1344344344));
		
	}
}
