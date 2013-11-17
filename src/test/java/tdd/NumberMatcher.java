package tdd;

import org.springframework.beans.factory.annotation.Autowired;

public class NumberMatcher {

    @Autowired
    NamesRepository repository;

    public NumberMatcher(NamesRepository repository) {
        this.repository = repository;
        System.out.println(">>>>>>>>>>> Constructing NumberMatcher...");

    }

    String numberName(int i) {

        String iStr = Integer.valueOf(i).toString();

        if (iStr.length() > 0) {
            char c = iStr.charAt(0);
            return repository.getName(String.valueOf(c));
        } else return "";
    }
}
