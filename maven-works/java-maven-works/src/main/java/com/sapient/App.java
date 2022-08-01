package com.sapient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {

    private static Logger logger = LoggerFactory.getLogger(App.class);  

    public static void main(String[] args) throws ClassNotFoundException {
    	
    	Class.forName("com.sapient.Driver"); 
    	
        for (int i = 0; i < 10; i++) {
            logger.info(" i value is {}", i);
        }
    }
}
