import java.util.Scanner;

public class DivisionOfTwoNumber {
	
 public static void main(String args[])
	   {
	      int p, q, r;
	      System.out.println("Enter two integers for Division: ");
	      Scanner sc = new Scanner(System.in);   //System.in An InputStream which is typically connected to keyboard input of console programs.
	      p = sc.nextInt();    //scan data for input of integer value 
	      q = sc.nextInt();
	      r = p / q;
	      System.out.println("Division of the integers = "+r);
	   }
	}

