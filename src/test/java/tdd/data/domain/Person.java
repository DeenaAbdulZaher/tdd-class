/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tdd.data.domain;

/**
 *
CREATE TABLE  `tddclass`.`person` (
`id` INT( 11 ) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY ,
`name` VARCHAR( 100 ) NULL
) ENGINE = INNODB;
 * @author Gamal Shaban OLC
 */
public class Person {
    
    private Integer id;

    private String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
//    public void setName(String name) {
//        this.name = name;
//    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
//    public void setId(Integer id) {
//        this.id = id;
//    }
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + '}';
    }

}
