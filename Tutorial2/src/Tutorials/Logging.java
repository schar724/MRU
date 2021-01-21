package Tutorials;
import java.util.logging.*;

public class Logging {
	
	/**
	 * There are 7 log levels
	 * 		1. Severe		^
	 * 		2. Warning		|
	 * 		3. Info         |
	 * 		4. Config       | Higher level
	 * 		5. Fine         |
	 * 		6. Finer        |
	 * 		7. Finest	    |
	 * 
	 * 		need to specify the desired level each time:
	 * 
	 * 		LOGR.log(Level.INFO, "My first Log");
	 * 
	 * 				or
	 * 
	 * 		LOGR.info("My second log");
	 * 
	 * 		Now you will be able to see the log info on the console
	 * 
	 *   ************************************************************
	 *   
	 *   Any log lower the INFO level will not be shown in the log file or console
	 *   
	 *   To manually set the level:
	 *   
	 *   	1. Reset the LogManager:
	 *   		LogManager.getLogManager().reset();
	 *   
	 *   	2. Then set the level:
	 *   		LOGR.setLevel(Level.FINER);
	 *   
	 *   		** Can use ALL or OFF to include all or neither
	 *   
	 *   Since we reset the LogManager the output/logs won't be shown on the screen
	 *   	- to fix this we need to define a HANDLER.
	 *   
	 *   	Handlers can specify what to do with the information. ex) print to a file instead of the console
	 *   
	 *   To show logs on the console create a ConsoleHandler:
	 *   
	 *   	1. ConsoleHandler ch = new ConsoleHandler(); <-- ch is the name of the console handler
	 *   	2. ch.setLevel(Level.ALL); <-- set this to the same level that the LOGR(logger) is set
	 *   	3. LOGR.addHandler(ch); <-- LOGR is the name of our logger
	 *   
	 *   BUT, we would normally use a FileHandler:
	 *   
	 *   	FileHandler fh = new FileHandler("myLog.log"); <--- myLog is the name of the file
	 *   	fh.setLevel(Level.ALL);
	 *   	LOGR.addHandler(fh);
	 *   
	 *   	this creates an XML file, but we can change it using setFormatter:
	 *   
	 *   	fh.setFormatter(new SimpleFormatter()); <-- uses the same format as the ConsoleHandler
	 *   
	 *   To append to the previous log file instead of overwriting it:
	 *   
	 *   	FileHandler fh = new FileHandler("myLog.log", true);
	 *   
	 *   ** set up the log in a separate method or class
	 *   
	 *   YOU MUST generate the log file into the doc in your project folder
	 *   
	 *   	FileHandler fh = new File Handler("doc/myLog.log", true);
	 *   	
	 * 
	 */
	
	private final static Logger LOGR = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	
	
	public void run()
	{
		
		LogManager.getLogManager().reset();
		
		LOGR.setLevel(Level.ALL);
		
		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.ALL);
		LOGR.addHandler(ch);
		
		//better to use a FileHandler
		
		
		
		LOGR.log(Level.INFO, "My first Log");
		LOGR.info("My second log");
		LOGR.fine("My thrid log");
		
	}

}
