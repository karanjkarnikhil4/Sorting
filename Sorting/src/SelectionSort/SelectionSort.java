package SelectionSort;

//Insertion sort my implementation. A bit difficult to understand at first sight.
//Need to have an easy implementation using only one pointer 

public class SelectionSort {

    private static int[] integerArray = {20,35,-15,7,55,1,-22};
    private static int numberOfSwaps = 0;
    public static void main(String[] args)
    {
        System.out.println("Array Before Sorting");
        System.out.println("");

        for (int integer  : integerArray) {
            System.out.print(integer);
            System.out.print(" ");
        }

        for (int sortedPointer = integerArray.length-1;sortedPointer>0;sortedPointer--)
        {
            int largestNumberIndex = sortedPointer;

            for (int searchingPointer = 0; searchingPointer<=sortedPointer; searchingPointer++)
            {
                if(integerArray[searchingPointer]>integerArray[largestNumberIndex])
                {
                    largestNumberIndex = searchingPointer;
                }
            }
            Swap(largestNumberIndex,sortedPointer);
        }


        System.out.println("");

        System.out.println("Array After Sorting");
        System.out.println("");

        for (int integer  : integerArray) {
            System.out.print(integer);
            System.out.print(" ");
        }

        System.out.println("");
        System.out.println("Number of Swaps: " +numberOfSwaps);

    }

    private static void Swap(int index1, int index2) {

        if(index1 ==index2)
        {
            return;
        }

        numberOfSwaps++;

        int temp = integerArray[index1];
        integerArray[index1] = integerArray[index2];
        integerArray[index2] = temp;
    }
}
