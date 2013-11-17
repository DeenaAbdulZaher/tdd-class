package tdd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NumberNamesConfiguration {
  @Bean public NumberNamesRepository repository() {
    return new EnglishNumberNamesRepository();
  }

  @Bean public NumberNames numberNames() {
    return new NumberNames();
  }
}
