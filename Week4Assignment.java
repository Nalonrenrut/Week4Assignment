// Code reviewed by @professorgordon
//Nolan Chandler Turner @Nalonrenrut
package week4Practice;
import java.util.Scanner;
public class Week4Assignment 
{

	public static void main(String[] args) 
	{
		double length;
		double width;
		double height;
		
	      Scanner input = new Scanner(System.in);
	      System.out.println("This program will accept a length, width and height of a box,\nand then it will report the surface area and volume of it.\n");
	      System.out.print("\tEnter the box length: ");
	      length = input.nextDouble();
	      System.out.print("\tEnter the box  width: ");
	      width = input.nextDouble();
	      System.out.print("\tEnter the box height: ");
	      height = input.nextDouble();
	      System.out.printf("\nThe surface area of the box is: %,.2f\n", calcSurfaceArea(length,width,height));
	      System.out.printf("The volume of the box is: %,.2f\n", calcVolume(length,width,height));
	      
	      input.close();
	}

	private static double calcVolume(double length, double width, double height)
	{
		double volume = (length*width*height);
		return volume;
	}

	private static double calcSurfaceArea(double length, double width, double height)
	{
		double surfaceArea = (2*length*width)+(2*length*height)+(2*width*height);
		return surfaceArea;
	}

	

}
