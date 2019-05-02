package br.com.danielpadua.lombok_examples;

public class AppNoLombok 
{	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AppNoLombok.class);	  
	 
    public static void main( String[] args )
    {    	
        log.info( "Hello World!" );
    }
}
