package tdd;

import java.util.HashMap;
import java.util.Map;

public class EnglishRepository implements NamesRepository {

    private final HashMap<String, String> names = new HashMap<String, String>();

    public EnglishRepository() {
        System.out.println(">>>>>>>>>>> Constructing EnglishRepository...");
        names.put("1","one");
        names.put("2","two");
        names.put("3","three");
        names.put("4","four");
        names.put("5","five");
        names.put("6","six");
        names.put("7","seven");
        names.put("8","eight");
        names.put("9","nine");
        names.put("10","ten");
        names.put("11","eleven");
        names.put("12","twelve");
        names.put("13","thirteen");
        names.put("14","fourteen");
        names.put("15","fifteen");
        names.put("16","sixteen");
        names.put("17","seventeen");
        names.put("18","eighteen");
        names.put("19","nineteen");
        names.put("20","twenty");
        names.put("30","thirty");
        names.put("40","forty");
        names.put("50","fifty");
        names.put("60","sixty");
        names.put("70","seventy");
        names.put("80","eighty");
        names.put("90","ninety");
        names.put("00","hundred");
        names.put("000","thousand");
        names.put("000000","million");
    }

    @Override
    public String getName(String digit) {
        return names.get(digit);
    }
}
