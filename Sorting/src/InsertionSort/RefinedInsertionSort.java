package InsertionSort;

public class RefinedInsertionSort {
	
	private static int[] integerArray = {20,35,-15,7,55,1,-22};
	
	public static void main(String[] args) {
		
		  System.out.println("Array Before Sorting");
	        System.out.println("");
	        for (int integer  : integerArray) {
	            System.out.print(integer);
	            System.out.print(" ");
	        }
	        
	        
	        for(int firstUnsortedElement =1; firstUnsortedElement <=integerArray.length-1;firstUnsortedElement++)
	        {
	        	int newElement = integerArray[firstUnsortedElement];
	        	
	        	int sortedElement = firstUnsortedElement-1;
	        	
	        	for(;sortedElement >=0 && integerArray[sortedElement] > newElement;sortedElement--) {
	        		
	        		integerArray[sortedElement+1]=integerArray[sortedElement];	  
	        		
	        	}
	        	
	        	integerArray[sortedElement+1] = newElement;
	        }
	        
	        System.out.println("Array After Sorting");
	        System.out.println("");
	        for (int integer  : integerArray) {
	            System.out.print(integer);
	            System.out.print(" ");
	        }
	        
	}

}
