/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import com.orange.olc.training.configuration.Configuration;
import com.orange.olc.training.matcher.NumberMatcher;
import org.hamcrest.Matcher;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatcher;
import org.mockito.internal.matchers.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Gamal Shaban OLC
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configuration.class)
public class NumberNamesTest {

    @Autowired
    NumberMatcher numberMatcher;

//     @Test
//    public void checkInit() throws Exception {
//        assertThat(numberMatcher, is(not(nullValue())));
//    }
    
    @Test
    public void checkOne() throws Exception {
        assertThat(numberMatcher.matches(1), is("one"));
    }

    @Test
    public void checkTwo() throws Exception {
        assertThat(numberMatcher.matches(2), is("two"));
    }

  
}
