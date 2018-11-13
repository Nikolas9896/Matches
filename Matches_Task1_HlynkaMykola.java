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
	public static void main(String[] args) {
		
		
		// squares = number of squares;
		// dataOfsquares = number of squares or addional operator in if condiction
		int squares = 0, dataOfsquares, matches = 0, one1 = 1, billion = 1000000000;
	    
	    System.out.println("***Task 1: Matches***");
	    
	    while ( squares < one1 || squares > billion )
	        {
	      
	         System.out.println("Input number of squares:");
	         Scanner S=new Scanner(System.in);
             squares=S.nextInt();
        
        
	        }
	        
	        
	        
	        // if n equel 4 
	    if(squares == 4)
	    
	        {
	            matches = 12;
	        }
	        
	        // if n less than 4 
	    else if(squares < 4)
	       {
	           matches = 4 + ( squares - 1 ) * 3;
	       }
	       
	       // if n much than 4
	   else 
	    {   
	        //dataOfsquares used for condition
	        dataOfsquares = squares;
	        
	        matches = 12 + ( dataOfsquares/4 - 1) * 10;
	        
	        dataOfsquares = dataOfsquares % 4;
	        
	        if( dataOfsquares == 1 )
	        {
	            matches = matches + 3;
	        }
	        else if( dataOfsquares == 2 )
	        {
	            matches = matches + 5;
	        }
	        else if( dataOfsquares == 3 )
	        {
	            matches = matches + 8;
	        }
	    }
	    //****function for convert usigned int to string for preview.
	    String sInt = Integer.toUnsignedString(matches);
	    //Output.
	    System.out.println(" The minimum number of matches required to construct " + squares + " squares: " + sInt);
    }
}