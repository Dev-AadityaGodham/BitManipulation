// get bit oprations
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  
	  //firs initalize the n and position at which u want to find that bit
	  int n=6; // 0110
	  int pos = 3;
	  
	  //you can also get the number and position from the user
// 	  Scanner sc =new Scanner(System.in);
// 	  System.out.println("Enter the number :");
// 	  int n = sc.nextInt();
// 	  System.out.println("Enter the position :");
// 	  int pos =sc.nextInt();

	  //the bitMask
	  // 1 left shift position
	  int bitMask = 1<<pos;
	  
	  //logic
	  
	  if ((bitMask & n)==0){
	      System.out.print("the bit is 0");
	  }else{
	      System.out.print("the bit is 1");
	  } 
	}   
}
