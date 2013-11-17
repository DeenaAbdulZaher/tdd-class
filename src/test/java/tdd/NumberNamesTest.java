package tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = NumberMatcherConfig.class)
public class NumberNamesTest {

    @Autowired
    private NumberMatcher numberMatcher;

    @Autowired
    private NumberMatcher numberMatcher2;

    @Test
    public void should1beOne() throws Exception {
        assertThat(numberMatcher.numberName(1), is("one"));
    }

    @Test
    public void should2beTwo() throws Exception {
        assertThat(numberMatcher.numberName(2), is("two"));
    }

}
