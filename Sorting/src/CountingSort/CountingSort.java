package CountingSort;

public class CountingSort {

  public static void main(String[] args) {


    int[] integerArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

    System.out.println("Array Before Sorting");
    System.out.println("");
    for (int integer : integerArray) {
      System.out.print(integer);
      System.out.print(" ");
    }


    Counting(integerArray, 1, 10);


    System.out.println("Array After Sorting");
    System.out.println("");
    for (int integer : integerArray) {
      System.out.print(integer);
      System.out.print(" ");
    }

  }

  public static int[] Counting(int[] inputArray, int startRange, int endRange) {

    int[] countingArray = new int[endRange + 1 - startRange];

    for (int i = 0; i < inputArray.length; i++) {
      int inputNumber = inputArray[i];

      countingArray[inputNumber - 1]++;

    }

    int input = 0;

    for (int j = 0; j < countingArray.length; j++) {

      if (countingArray[j] > 0) {
        for (int k = 0; k < countingArray[j]; k++) {
          inputArray[input] = j + 1;
          input++;
        }
      }
    }
    return inputArray;
  }



}
