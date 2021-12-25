
public class DuplicateValues {

	   
	    public static void main(String args[])
	    {
	        // Crating an array
	        String arr[] = {"BMW", "AUDI", "JAGUAR", "RANGE ROVER", "BMW", "CRETA", "JAGUAR"};
	        // Displaying the array
	        System.out.print("Array: ");
	        printArray(arr);
	        System.out.print("The duplicate elements are : ");
	        // Print non duplicate elements
	        printDupes(arr);
	    }
	    // Function to print the array
	    static void printArray(String arr[])
	    {
	        for(int i = 0; i < arr.length ; i++)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	    
	    public static void printDupes(String arr[])
	    {  
	     
	        int j = 0;
	        // Checks for duplicate elements
	        for (int i=0; i<arr.length-1; i++)
	        {
	            for(j=i+1;j<arr.length;j++)
	                if (arr[i].equals(arr[j])&&i!=j)
	                {
	                    System.out.print(arr[j]+" "); 
	            }  
	        }
	    }  
	}
