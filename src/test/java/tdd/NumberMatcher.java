package tdd;

import org.springframework.beans.factory.annotation.Autowired;

public class NumberMatcher {

    @Autowired
    NamesRepository englishRepository;

    public NumberMatcher() {
    }

    String numberName(int i) {

        String iStr = Integer.valueOf(i).toString();

        if (iStr.length() > 0) {
            char c = iStr.charAt(0);
            return englishRepository.getName(String.valueOf(c));
        } else return "";
    }
}
