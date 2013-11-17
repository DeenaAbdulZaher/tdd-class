package com.spring.training.day1.numberingKata.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;

import com.spring.training.day1.numberingKata.container.EnglishNumberContainer;
import com.spring.training.day1.numberingKata.container.NumberContainer;
import com.spring.training.day1.numberingKata.generator.EnglishNumberGenerator;
import com.spring.training.day1.numberingKata.generator.NumberGenerator;

@ContextConfiguration
public class NumberNameConfiguration {
	
	@Bean public NumberGenerator numberGenerator() {
		return new EnglishNumberGenerator();
	}
	
	@Bean public NumberContainer numberContainer() {
		return new EnglishNumberContainer();
	}
}
