/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

/**
 *
 * @author Gamal Shaban OLC
 */
class NumberNames {

  private NumberNamesRepository numberNameRepository =
          new EnglishNumberNamesRepository();

  public String read(Integer digit){
        return numberNameRepository.nameOf(digit);
    }
}
