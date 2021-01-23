package Tutorials;

/**
 * This program is to show how to make a JavaDoc
 * 
 * 
 * @author Scott Charles
 * @version 1.0
 * @since 2021-01-21
 *
 */

public class JavaDoc {
	
	/**
	 * 
	 * This is the form for the JavaDoc file
	 * 
	 * author author_name Describes the author
	 * 
	 * param description provides information about the parameter being passed
	 * 
	 * see reference generates a link to other element of the document
	 * 
	 * version version-name provides a version of the class, interface or enum
	 * 
	 * return description provides the return value
	 * 
	 * @param String args yadayadayada
	 */
	
	public static void main (String [] args)
	{
		
		System.out.println("Hello Stars!");
	    
	    drawStars(1);
	    System.out.println();
	    drawStars(2);
	    System.out.println();
	    drawStars(5);
	    System.out.println();
	    drawStars(12);
	    System.out.println();
	}
	
	/**
	 * drawStars returns a pyramid of centered stars
	 * 
	 * @param num number of rows in the pyramid
	 */
	public static void drawStars(int num)
	{
		int spc; //variable used for blank spaces
		spc = num;
			
		for(int k = 0; k <= num; k++)
		{
			
			//Prints spaces before the stars
			for(int i = spc; i >= 0; i--)
			{
				System.out.print(" ");
			}	
			
			//Prints stars
			for(int j = 0; j < k*2-1; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
			
			spc--;
		}	
	}
}
