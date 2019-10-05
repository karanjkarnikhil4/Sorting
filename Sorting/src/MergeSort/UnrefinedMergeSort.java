package MergeSort;

public class UnrefinedMergeSort {

  private static int[] integerArray = {20, 35, -15, 7, 55, 1, -22};

  public static void main(String[] args) {


    System.out.println("Array Before Sorting");
    System.out.println("");

    for (int integer : integerArray) {
      System.out.print(integer);
      System.out.print(" ");
    }

    MergeSort(0, integerArray.length - 1);

    System.out.println("");

    System.out.println("Array After Sorting");
    System.out.println("");

    for (int integer : integerArray) {
      System.out.print(integer);
      System.out.print(" ");
    }

  }


  public static void MergeSort(int UnstartIndex, int UnendIndex) {

    int lengthOfSortedAray = UnendIndex - UnstartIndex + 1;
    int[] sortedArray = new int[lengthOfSortedAray];
    if (UnendIndex - UnstartIndex == 0) {

      return;
    }

    int divisionIndex = ((UnstartIndex + UnendIndex) / 2);

    int firstUnSortedArrayStartIndex = UnstartIndex;
    int firstUnSortedArrayLastIndex = divisionIndex;

    int secondUnsortedArrayStartIndex = divisionIndex + 1;
    int secondUnsortedArrayLastIndex = UnendIndex;


    if (firstUnSortedArrayLastIndex - firstUnSortedArrayStartIndex > 0) {
      MergeSort(firstUnSortedArrayStartIndex, firstUnSortedArrayLastIndex);
    }

    if (secondUnsortedArrayLastIndex - secondUnsortedArrayStartIndex > 0) {
      MergeSort(secondUnsortedArrayStartIndex, secondUnsortedArrayLastIndex);
    }

    int sortedArrayIndex = 0;

    while (sortedArrayIndex < lengthOfSortedAray) {

      if ((firstUnSortedArrayStartIndex <= firstUnSortedArrayLastIndex)
          && (secondUnsortedArrayStartIndex <= secondUnsortedArrayLastIndex)
          && (integerArray[firstUnSortedArrayStartIndex] > integerArray[secondUnsortedArrayStartIndex])) {


        sortedArray[sortedArrayIndex] = integerArray[secondUnsortedArrayStartIndex];
        secondUnsortedArrayStartIndex++;
        sortedArrayIndex++;


      }


      else if ((secondUnsortedArrayStartIndex <= secondUnsortedArrayLastIndex)
          && (firstUnSortedArrayStartIndex <= firstUnSortedArrayLastIndex)
          && (integerArray[firstUnSortedArrayStartIndex] <= integerArray[secondUnsortedArrayStartIndex])

      ) {


        sortedArray[sortedArrayIndex] = integerArray[firstUnSortedArrayStartIndex];
        firstUnSortedArrayStartIndex++;
        sortedArrayIndex++;



      }

      else if ((firstUnSortedArrayStartIndex > firstUnSortedArrayLastIndex)
          && (secondUnsortedArrayStartIndex <= secondUnsortedArrayLastIndex)) {
        sortedArray[sortedArrayIndex] = integerArray[secondUnsortedArrayStartIndex];
        secondUnsortedArrayStartIndex++;
        sortedArrayIndex++;

      }

      else if ((firstUnSortedArrayStartIndex <= firstUnSortedArrayLastIndex)
          && (secondUnsortedArrayStartIndex > secondUnsortedArrayLastIndex)) {
        sortedArray[sortedArrayIndex] = integerArray[firstUnSortedArrayStartIndex];
        firstUnSortedArrayStartIndex++;
        sortedArrayIndex++;

      }


    }

    int j = 0;
    for (int i = UnstartIndex; i <= UnendIndex; i++) {
      integerArray[i] = sortedArray[j];
      j++;
    }


  }

}
