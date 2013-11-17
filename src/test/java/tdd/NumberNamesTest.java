/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 *
 * @author Gamal Shaban OLC
 */
public class NumberNamesTest {

    @Test
    public void isReadingOne() throws Exception {
        assertThat(readNumber(1), is("one"));
    }

    @Test
    public void isReadingNine() throws Exception {
        assertThat(new NumberNames(new EnglishNumberNamesRepository()).read(9), is("nine"));
    }

    /*@Test
    public void isReadingOneDigit2() throws Exception {
        
    }*/

    @Test
    public void isReadingTwoDigits() throws Exception {
        assertThat(readNumber(12), is("twelve"));
    }

    @Test
    public void isReadingThreeDigits() throws Exception {
        assertThat(readNumber(345),
                is("Three Hundred and forty five"));
    }

    @Test
    public void isReadingSixDigits() throws Exception {
        assertThat(readNumber(43112603),
                is("forty three million, one hundred and twelve thousand, six hundred and three"));
    }

    private String readNumber(final Integer digit) {
      return new NumberNames(new EnglishNumberNamesRepository()).read(digit);
    }
}
