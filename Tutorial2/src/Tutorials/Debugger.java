package Tutorials;

public class Debugger {
	
	/**
	 *  Break Point: helps the programmer pause the program at a specific point
	 *  
	 *  	to create, double click on the blue margin
	 *  	press the debugger button after setting the break point
	 *  
	 *  	line with the break point will be highlighted green THIS LINE DOES NOT GET EXECUTED
	 *  
	 *  	Can now run the remaining code line by line using "step-into" and "step over"
	 *  
	 *  		"step-over" advances the debugger without going into the method being called
	 *  		"step-into" will enter the debugger into the called method so you can run the called method step by step
	 *  
	 *  	if you have an expression in your code and the value of that expression is important you add it to you WATCH LIST
	 *  	
	 *  		highlight the expression and rightclick
	 *  		select the watch
	 *  
	 *  		the expression will be added to the list
	 * 
	 */
	
	public void run()
	{
		System.out.println("Hello, world.");
	}

}
