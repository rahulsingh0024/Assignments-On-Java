
public class CyclicallyRotateAGivenArrayClockwise {

	    public static void main(String[] args) 
	    {
	         int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7 };
	        System.out.println("The array is : ");
	        printArray(arr);
	        rotate_array_clockwise(arr);
	         System.out.println("After rotation the array is : ");
	        printArray(arr);
	    }
	    static void rotate_array_clockwise(int arr[]) 
	    {
	        int temp = arr[arr.length - 1];
	        
	        for (int i = arr.length - 1; i > 0; i--) 
	        {
	            arr[i] = arr[i - 1];
	        }
	        
	        arr[0] = temp;
	    }
	    
	     static void printArray(int[] arr) 
	    { 
	          for (int i=0; i<arr.length; i++) 
	        { 
	            System.out.print(arr[i] + " "); 
	        } 
	        System.out.println("");
	    }
	}
