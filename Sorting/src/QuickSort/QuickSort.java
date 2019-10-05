package QuickSort;

public class QuickSort {

  public static void main(String[] args) {

    int[] integerArray = {20, 35, -15, 7, 55, 1, -22};

    System.out.println("Array Before Sorting");
    System.out.println("");
    for (int integer : integerArray) {
      System.out.print(integer);
      System.out.print(" ");
    }

    QuickSort(integerArray, 0, 6);


    System.out.println("Array After Sorting");
    System.out.println("");
    for (int integer : integerArray) {
      System.out.print(integer);
      System.out.print(" ");
    }

  }

  public static void QuickSort(int[] integerArray, int start, int end) {

    if (start == end) {
      return;
    }

    int pivot = end;
    int rightPointer = end - 1;
    int leftPointer = start;

    for (; leftPointer <= pivot; leftPointer++) {
      if (integerArray[leftPointer] > integerArray[pivot]) {
        for (; rightPointer >= leftPointer; rightPointer--) {
          if (integerArray[rightPointer] < integerArray[pivot]) {
            int temp = integerArray[leftPointer];
            integerArray[leftPointer] = integerArray[rightPointer];
            integerArray[rightPointer] = temp;
            break;
          }

          if (rightPointer == leftPointer) {
            int temp = integerArray[pivot];
            integerArray[pivot] = integerArray[rightPointer];
            integerArray[rightPointer] = temp;
            pivot = rightPointer;

          }

        }
      }
    }

    if (pivot != 0) {
      QuickSort(integerArray, start, pivot - 1);
    }
    QuickSort(integerArray, pivot, end);

  }

}
