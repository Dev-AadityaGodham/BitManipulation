/******************************************************************************

/**************************UpdateBit(The main diffrance between update bit from the set bit and clear bit is u ask user "You want to change the bit to one or zero" and on the basis of the input w'll do oprations)*****************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
//you can also get the number and position from the user
// 	  System.out.println("Enter the number :");
// 	  int n = sc.nextInt();
// 	  System.out.println("Enter the position :");
// 	  int position =sc.nextInt();

    Scanner sc =new Scanner(System.in);

    int n =5;
    int position = 2;
    int bitMask = 1<<position;
    int notBitMask = ~(bitMask);
    System.out.println("You want to change the bit to one or zero");
    int updateBit=sc.nextInt();
    int NewNumber;
    
    
    if (updateBit == 0){
        NewNumber = notBitMask & n;
        System.out.println("The previous number is :" +n);
        System.out.println("The new number is :" +NewNumber);
    } else {
        NewNumber = bitMask | n;
        System.out.println("The previous number is :" +n);
        System.out.println("The new number is :" +NewNumber);
    }
        
	}
}
