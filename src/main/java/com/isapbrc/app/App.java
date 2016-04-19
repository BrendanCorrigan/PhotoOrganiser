package com.isapbrc.app;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {

    /** Default logger */
	private static Logger logger = Logger.getLogger(App.class);


    public static void main( String[] args )
    {
        logger.trace("Enter");
        logger.debug("Printing Hello World!");
            
        System.out.println( "Hello World!" );
        
        logger.trace("Exit");
    }
}
