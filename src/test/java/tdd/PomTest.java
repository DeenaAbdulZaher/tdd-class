package tdd;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;

public class PomTest {

  @Test
  public void iTestThereforeIExist() throws Exception {
    ApplicationContext weirdestContextEverSeen = mock(ApplicationContext.class);
    assertThat("stranger things", haveHappened());
  }

  @Test
  public void shouldShowMatcherOutput() throws Exception {
    assertThat(5.3, is(closeTo(5, 0.2)));
  }




  private Matcher<String> haveHappened() {
    return new TypeSafeMatcher<String>() {
      @Override
      public boolean matchesSafely(String s) {
        return true;
      }

      @Override
      public void describeTo(Description description) {
        description.appendText("this text will never be printed because this matcher always matches");
      }
    };
  }
}
