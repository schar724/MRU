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
	
	public static void main(String [] args)
	{
		System.out.println("Hello Prime!");
	    
	    System.out.println(isPrime(2));
	    System.out.println(isPrime(3));
	    System.out.println(isPrime(4));
	    System.out.println(isPrime(10));
	    System.out.println(isPrime(11));
	    System.out.println(isPrime(12));
	}
	
	//***********************END OF RUN METHOD***********************************************
	
	/**
	 * isPrime checks if a number is prime
	 * 
	 * @param num number being checked
	 * @return condition is true or false depending on if the number is prime or not
	 */
	public static boolean isPrime(int num)
	  {
		boolean condition;
		
		condition = true;
		
		for(int i = 2; i <= num/2; i++)
		{	  
			if(num % i == 0)
			{
				condition = false;
			}  
		}
		
		return condition;
	  }
	
	//***************************END OF isPrime METHOD****************************************
}
