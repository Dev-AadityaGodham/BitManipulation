/******************************************************************************
Set Bit(use to change the bit at perticular position)
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
        int position = 1;
        
        // set the bitMask
        
        int bitMask = 1<<position;
        
        //ater set position opration the new number is
        
        int NewNumber = bitMask | n;
        
        System.out.println("The previous number is :" +n);
        System.out.println("The new number is :" +NewNumber);
        
        
	}
}
