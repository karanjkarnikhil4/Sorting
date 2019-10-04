package BubbleSort;

public class BubbleSort {

  private static int[] integerArray = {20,35,-15,7,55,1,-22};
  private static int numberOfSwaps = 0;

    public static void main(String[] args) {

    System.out.println("Array Before Sorting");
      System.out.println("");
    for (int integer  : integerArray) {
        System.out.print(integer);
      System.out.print(" ");
    }

    // lets get the sorted partition pointer initialized first

    for (int sortedPointer = integerArray.length - 1; sortedPointer > 0; sortedPointer--) {
      for (int comparePointer = 0; comparePointer < sortedPointer; comparePointer++) {
        if (integerArray[comparePointer] > integerArray[comparePointer + 1]) {
          Swap(comparePointer, comparePointer + 1);
        }
      }
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
    numberOfSwaps++;
    int temp = integerArray[index1];
    integerArray[index1] = integerArray[index2];
    integerArray[index2] = temp;
  }
}
