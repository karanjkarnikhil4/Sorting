package InsertionSort;

public class InsertionSort {

    private static int[] integerArray = {20,35,-15,7,55,1,-22};
  

    public static void main(String[] args)
    {
        System.out.println("Array Before Sorting");
        System.out.println("");
        for (int integer  : integerArray) {
            System.out.print(integer);
            System.out.print(" ");
        }

        for(int sortedPointer = 0;sortedPointer <integerArray.length-1;sortedPointer++)
        {
            int unsortedNumber = integerArray[sortedPointer + 1];

            for (int temporarySortedPointer = sortedPointer; temporarySortedPointer>=0;temporarySortedPointer--)
            {

                 if(unsortedNumber < integerArray[temporarySortedPointer])
                 {
                     integerArray[temporarySortedPointer+1]= integerArray[temporarySortedPointer];
                     if(temporarySortedPointer ==0)
                     {
                         integerArray[temporarySortedPointer] = unsortedNumber;
                     }
                 }
                 else
                 {
                    integerArray[temporarySortedPointer+1] = unsortedNumber;
                    break;
                 }

            }
        }
        System.out.println("Array After Sorting");
        System.out.println("");
        for (int integer  : integerArray) {
            System.out.print(integer);
            System.out.print(" ");
        }

    }
}
