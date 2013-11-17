package tdd;

import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
public class NumberNamesConfiguration {
  @Bean public NumberNamesRepository repository() {
    return new EnglishNumberNamesRepository();
  }

  @Bean public NumberNames numberNames() {
    return new NumberNames();
  }
}
