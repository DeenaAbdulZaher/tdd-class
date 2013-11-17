package tdd;

import java.util.HashMap;
import java.util.Map;

public class EnglishNumberNamesRepository implements NumberNamesRepository {
  private Map<Integer, String> numberNames = new HashMap<Integer, String>();

  public EnglishNumberNamesRepository() {
    System.out.println("Instantiating English Number Names Repository");
    numberNames.put(1, "one");
    numberNames.put(2, "two");
    numberNames.put(3, "three");
    numberNames.put(4, "four");
    numberNames.put(5, "five");
    numberNames.put(6, "six");
    numberNames.put(7, "seven");
    numberNames.put(8, "eight");
    numberNames.put(9, "nine");
    numberNames.put(10, "ten");
  }

  @Override
  public String nameOf(Integer digit) {
    return numberNames.get(digit);
  }


}
