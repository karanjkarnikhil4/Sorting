package Recursion;

public class Factorial {

  public static void main(String[] args) {

    long factorial = GetFactorial(10);
    System.out.println("Factorial is " + factorial);

    factorial = GetRecursiveFactorial(10);
    System.out.println("Factorial is " + factorial);

  }

  public static long GetFactorial(long number) {
    long factorial = 1;

    if (number == 0) {
      return factorial;
    }

    else {
      for (long i = 1; i <= number; i++) {
        factorial = factorial * i;
      }
    }
    return factorial;
  }

  public static long GetRecursiveFactorial(long number) {
    if (number == 0) {
      return 1;
    }

    return number * GetRecursiveFactorial(number - 1);
  }

}
