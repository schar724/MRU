package mru.lab1.project;

import java.util.Scanner;

/**
 * This program demonstrates methods
 */

public class Geometry {
	
	public void runApplication() {
		int choice; // The user's choice
		double value = 0; // The method's return value
		char letter; // The user's Y or N decision
		double radius; // The radius of the circle
		double length; // The length of the rectangle
		double width; // The width of the rectangle
		double height; // The height of the triangle
		double base; // The base of the triangle
		double side1; // The first side of the triangle
		double side2; // The second side of the triangle
		double side3; // The third side of the triangle

		// Create a scanner object to read from the keyboard
		Scanner keyboard = new Scanner(System.in);

		// The do loop allows the menu to be displayed first
		do {
			// TASK #2 Call the printMenu method
			
			printMenu();

			choice = keyboard.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter the radius of " + "the circle: ");
				radius = keyboard.nextDouble();

				// TASK #4 Call the circleArea method and
				// store the result in the value variable
				
				value = circleArea(radius);

				System.out.println("The area of the " + "circle is " + value);
				break;
			case 2:
				System.out.print("Enter the length of " + "the rectangle: ");
				length = keyboard.nextDouble();
				System.out.print("Enter the width of " + "the rectangle: ");
				width = keyboard.nextDouble();

				// TASK #4 Call the rectangleArea method and
				// store the result in the value variable
				
				value = rectangleArea(length, width);

				System.out.println("The area of the " + "rectangle is " + value);
				break;
			case 3:
				System.out.print("Enter the height of " + "the triangle: ");
				height = keyboard.nextDouble();
				System.out.print("Enter the base of " + "the triangle: ");
				base = keyboard.nextDouble();

				// TASK #4 Call the triangleArea method and
				// store the result in the value variable
				
				value = triangleArea(base, height);

				System.out.println("The area of the " + "triangle is " + value);
				break;
			case 4:
				System.out.print("Enter the radius of " + "the circle: ");
				radius = keyboard.nextDouble();

				// TASK #4 Call the circumference method and
				// store the result in the value variable
				
				value = circleCircumference(radius);

				System.out.println("The circumference " + "of the circle is " + value);
				break;
			case 5:
				System.out.print("Enter the length of " + "the rectangle: ");
				length = keyboard.nextDouble();
				System.out.print("Enter the width of " + "the rectangle: ");
				width = keyboard.nextDouble();

				// TASK #4 Call the perimeter method and
				// store the result in the value variable
				
				value = rectanglePerimeter(length, width);
				
				System.out.println("The perimeter of " + "the rectangle is " + value);
				break;
			case 6:
				System.out.print("Enter the length of " + "side 1 of the " + "triangle: ");
				side1 = keyboard.nextDouble();
				System.out.print("Enter the length of " + "side 2 of the " + "triangle: ");
				side2 = keyboard.nextDouble();
				System.out.print("Enter the length of " + "side 3 of the " + "triangle: ");
				side3 = keyboard.nextDouble();

				// TASK #4 Call the perimeter method and
				// store the result in the value variable
				
				value = trianglePerimeter(side1, side2, side3);

				System.out.println("The perimeter of " + "the triangle is " + value);
				break;
			default:
				System.out.println("You did not enter " + "a valid choice.");
			}
			keyboard.nextLine(); // Consume the new line

			System.out.println("Do you want to exit " + "the program (Y/N)?: ");
			String answer = keyboard.nextLine();
			letter = answer.charAt(0);

		} while (letter != 'Y' && letter != 'y');
	}

	// TASK #2 Create the printMenu method here
	
	/**
	 * Prints the menu for the application.
	 * 
	 * A simple print method that gives the user the option of six operations.
	 * 
	 */
	public void printMenu()
	{
		
		System.out.println("This is a geometry calculator\n"
				+ "Choose what you would like to calculate\n"
				+ "1.Find the area of a circle\n"
				+ "2.Find the area of a rectangle\n"
				+ "3.Find the area of a triangle\n"
				+ "4.Find the circumference of a circle\n"
				+ "5.Find the perimeter of a rectangle\n"
				+ "6.Find the perimeter of a triangle\n"
				+ "Enter the number of your choice:");
	}

	// TASK #3 Create the value-returning methods here
	/**
	 * Calculates the area of a circle.
	 * 
	 * The user is prompted to enter the radius of a circle. 
	 * The radius is passed and used in the calculation of this method. 
	 * The area of the circle is returned.
	 * 
	 * @param rad radius as provided by the user
	 * @return circArea the area of a circle
	 */
	public double circleArea(double rad)
	{
		double circArea;
		
		circArea = Math.PI*Math.pow(rad, 2);
		
		return circArea;
	}
	
	/**
	 * Calculates the area of a rectangle.
	 * 
	 * The user is prompted to enter the length and width of a rectangle.
	 * These values are passed and used in the calculation.
	 * The area of the rectangle is returned
	 * 
	 * @param len length of the rectangle
	 * @param wid width of the rectangle
	 * @return rectArea the area of the rectangle
	 */
	public double rectangleArea(double len, double wid)
	{
		double rectArea;
		
		rectArea = len * wid;
		
		return rectArea;
	}
	
	/**
	 * Calculates the area of a triangle.
	 * 
	 * The base and height of a triangle is provided by the user. 
	 * These values are used in the calculation 1/2 * base * height. 
	 * The area of the triangle is returned
	 *  
	 * @param base base of the triangle
	 * @param height height of the triangle
	 * @return triArea the area of the triangle
	 */
	public double triangleArea(double base, double height)
	{
		double triArea;
		final double FACTOR = 0.5;
		
		triArea = FACTOR * base * height;
		
		return triArea;
	}
	
	/**
	 * Calculates the circumference of a circle.
	 * 
	 * The radius is provided by the user.
	 * The radius is passed and used in the calculation 2 * pi * radius.
	 * The circumference of the circle is returned
	 * 
	 * @param rad radius of the circle
	 * @return circum the circumference of the circle
	 */
	public double circleCircumference(double rad)
	{
		double circum;
		final double FACTOR = 2;
		
		circum = FACTOR * Math.PI * rad;
		
		return circum;
	}
	
	/**
	 * Calculates the perimeter of a rectangle.
	 * 
	 * The length and width of the rectangle are provided by the user.
	 * These values are passed and used in the calculation 2(length) + 2(width);
	 * the perimeter of the rectangle is returned
	 * 
	 * @param len lenght of the rectangle
	 * @param wid width of the rectangle
	 * @return rectPerim the perimter of the rectangle
	 */
	public double rectanglePerimeter(double len, double wid)
	{
		double rectPerim;
		final double FACTOR = 2;
		
		rectPerim = (FACTOR * len) + (FACTOR * wid);
		
		return rectPerim;
	}
	
	/**
	 * Calculates the perimeter of a triangle.
	 * 
	 * The length of the three sides of the triangle are provided by the user.
	 * These values are passed and used in the calculation.
	 * The perimeter of the triangle is returned
	 * 
	 * @param s1 side 1 of the triangle
	 * @param s2 side 2 of the triangle
	 * @param s3 side 3 of the triangle
	 * @return triPerim the perimeter of the triangle
	 */
	public double trianglePerimeter(double s1, double s2, double s3)
	{
		double triPerim;
		
		triPerim = s1 + s2 + s3;
		
		return triPerim;
	}
	
	// TASK #5 Write javadoc comments for each method
}