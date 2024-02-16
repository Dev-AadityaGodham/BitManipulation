/******************************************************************************
Clear Bit (changing the nth postion bit to the zero)
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
//you can also get the number and position from the user
// 	  Scanner sc =new Scanner(System.in);
// 	  System.out.println("Enter the number :");
// 	  int n = sc.nextInt();
// 	  System.out.println("Enter the position :");
// 	  int position =sc.nextInt();


	    
// 		//set the number and position 
        int n =5;
        int position = 2;
        
        // set the bitMask
        
        int bitMask = 1<<position;
        
        //not of bit bitMask
        
        int notBitMask = ~(bitMask);
        
       
        // for the new number
        int NewNumber = notBitMask & n;
        System.out.print(NewNumber);
        // System.out.println("The previous number is :" +n);
        // System.out.println("The new number is :" +NewNumber);
        
        
	}
}
