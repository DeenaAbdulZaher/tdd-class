/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orange.olc.training.matcher;

import com.orange.olc.training.repository.NamesRepository;
import org.hamcrest.Matcher;
import org.mockito.ArgumentMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author Ahmed Nashaat OLC
 */
public class NumberMatcher {

    @Autowired
    @Qualifier("namesRepositoryFromFile")
    private NamesRepository namesRepository;
    /**
     * 
     * @param digit
     * @return 
     */
    public Matcher<String> match(final Integer digit) {
        return new ArgumentMatcher<String>() {
            @Override
            public boolean matches(Object argument) {
                return namesRepository.nameOf(digit).equalsIgnoreCase(argument.toString());
            }
        };
    }

    /**
     *
     * @param digit
     * @return
     */
    public String matches(Integer digit) {
        return namesRepository.nameOf(digit);

    }
}
