import java.util.Scanner;

public class StringLength 
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		String str="Hello World";
		char[] len= str.toCharArray();
		int a=0;
		for(char ch : len)
		{
			a++;
		}		
		System.out.println("Length of a string is :"+a);
			
	}
}


