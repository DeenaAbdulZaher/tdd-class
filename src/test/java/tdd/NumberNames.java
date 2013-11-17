/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Gamal Shaban OLC
 */
class NumberNames {

  @Autowired
  NumberNamesRepository numberNameRepository;

  NumberNames(NumberNamesRepository numberNameRepository) {
    this.numberNameRepository = numberNameRepository;
  }

  public NumberNames() {
  }

  public String read(Integer digit){
        return numberNameRepository.nameOf(digit);
    }
}
