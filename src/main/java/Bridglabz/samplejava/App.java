package Bridglabz.samplejava;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger log=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	 String msg="Hello java";
         log.info(msg + "will be printed ");
         log.debug(msg + "will be printed on debug");
         log.warn(msg + "will be printed on warn");
         log.error(msg + "will be printed error ");
         log.fatal(msg + "will be printed on fatal");
         System.out.println(msg);
          
    }
}