package tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = NumberNamesConfiguration.class)
public class SpringContextTest {


  @Autowired
  public NumberNames numberNames;


  @Test
  public void shouldHaveWiredNumberNames() throws Exception {
    assertThat(numberNames, is(notNullValue()));
    assertThat(numberNames.numberNameRepository, is(notNullValue()));
  }
}
