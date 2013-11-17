/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gamal Shaban OLC
 */
class NumberNames {

  private NumberNamesRepository numberNameRepository = new EnglishNumberNamesRepository();

  public String read(Integer digit){
        return numberNameRepository.nameOf(digit);
    }
    
    private final Map<Integer,String> oneDigitMap= new HashMap<Integer,String>();
    
    private String readOneDigit(Integer digit)throws Exception{
        if(digit.toString().length()>1){
            throw new Exception("Digits Length must be only one digit.");
        }
        oneDigitMap.put(1, "one");
        oneDigitMap.put(2, "two");
        
        
        return null;
    }
}
