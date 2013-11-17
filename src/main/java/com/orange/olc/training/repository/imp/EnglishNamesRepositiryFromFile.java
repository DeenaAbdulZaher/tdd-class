/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orange.olc.training.repository.imp;

import com.orange.olc.training.repository.NamesRepository;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;

/**
 *
 * @author Ahmed Nashaat OLC
 */
public class EnglishNamesRepositiryFromFile implements NamesRepository {
    @Autowired
     PropertiesFactoryBean propertiesFactoryBean;

    @Override
    public String nameOf(int digit) {
        try {
            return propertiesFactoryBean.getObject().getProperty(""+digit);
        } catch (IOException ex) {
            Logger.getLogger(EnglishNamesRepositiryFromFile.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }
    
}
