/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orange.olc.training.configuration;

import com.orange.olc.training.matcher.NumberMatcher;
import com.orange.olc.training.repository.NamesRepository;
import com.orange.olc.training.repository.imp.EnglishNamesRepositiryFromFile;
import com.orange.olc.training.repository.imp.EnglishNamesRepository;
import java.util.Properties;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;

/**
 *
 * @author Ahmed Nashaat OLC
 */
@ContextConfiguration
public class Configuration {

    @Bean
    public NamesRepository namesRepository() {
        return new EnglishNamesRepository();
    }
    @Bean
    public NamesRepository namesRepositoryFromFile() {
        return new EnglishNamesRepositiryFromFile();
    }

    @Bean
    public NumberMatcher numberMatcher() {
        return new NumberMatcher();
    }
    
    @Bean
    public PropertiesFactoryBean propertiesFactoryBean(){
        PropertiesFactoryBean factoryBean=new PropertiesFactoryBean();
        Resource resource = new ClassPathResource("/english.properties");
        factoryBean.setLocation(resource);
        return factoryBean;
    }
}
