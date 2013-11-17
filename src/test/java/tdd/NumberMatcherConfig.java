package tdd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NumberMatcherConfig {

    @Bean
    public NumberMatcher numberMatcher() {
        return new NumberMatcher(namesRepository());
    }

    @Bean
    public NamesRepository namesRepository() {
        return new EnglishRepository();
    }
}
