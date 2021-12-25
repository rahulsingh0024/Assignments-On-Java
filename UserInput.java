import java.util.Scanner;

public class UserInput {
private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.print("Please Enter Integer Value = ");
		int x = sc.nextInt();
		System.out.println("User Entered Integer Value = " + x);
		
		System.out.print("\nPlease Enter Double Value = ");
		double y = sc.nextDouble();
		System.out.println("User Entered Double Value = " + y);
			
		System.out.print("\nPlease Enter Float Value = ");
		float z = sc.nextFloat();
		System.out.println("User Entered Float Value = " + z);

	}
}


