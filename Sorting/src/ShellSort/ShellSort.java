package ShellSort;

public class ShellSort {

	private static int[] integerArray = {20,35,-15,7,55,1,-22};
	private static int amountofShifting =0;
	 
	public static void main(String[] args) {
		  System.out.println("Array Before Sorting");
	        System.out.println("");
	        for (int integer  : integerArray) {
	            System.out.print(integer);
	            System.out.print(" ");
	        }
	        
	        for(int gap = integerArray.length/2 ;gap>=1; gap = gap/2)
	        {
	        	for(int firstUnsortedElement = gap;firstUnsortedElement < integerArray.length; firstUnsortedElement++)
	        	{
	        		int newElement = integerArray[firstUnsortedElement];
	        		int sortedElement = firstUnsortedElement-gap;
	        		
	        		for(; sortedElement>=0 && integerArray[sortedElement] > newElement;sortedElement-= gap)
	        		{
	        			integerArray[sortedElement+gap] = integerArray[sortedElement];
	        			amountofShifting++;
	        		}
	        		
	        		integerArray[sortedElement+gap] = newElement;
	        	}
	        }

	        System.out.println("");

	        System.out.println("Array After Sorting");
	        System.out.println("");

	        for (int integer  : integerArray) {
	            System.out.print(integer);
	            System.out.print(" ");
	        }
	        
	        System.out.println("Amount of Shifting: " +amountofShifting );
	}

}
