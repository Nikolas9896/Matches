/*
**********************************Task 1: Matches***********************
What is the minimum number of matches necessary to pit on the plane n squares with a side in one match? Matches can not be broken and put on each other. The vertices of the squares should be the points where the ends of the matches meet, and the sides are matches themselves.
Write a program that by the number of squares n to be constructed, finds the minimum number of matches required for this.
Input
One integer n (1 ≤ n ≤ pow( 10, 9 ).
Output
Print the minimum number of matches required to construct n squares.

Input example #1
4
Output example #1
12 
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 

	{
		int squares = 0, matches = 0, one1 = 1, billion = 1000000000;
	    
	    System.out.println("***Task 1: Matches***");
	    
	    while ( squares < one1 || squares > billion )
	        {
	      
	         System.out.println("Input number of squares:");
	         Scanner S=new Scanner(System.in);
             squares=S.nextInt();
        
        
	        }
	     System.out.println(" The minimum number of matches required to construct " + squares + " squares: " + matches);
	}
}