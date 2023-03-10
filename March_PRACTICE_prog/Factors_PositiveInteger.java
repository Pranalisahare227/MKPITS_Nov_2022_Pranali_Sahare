/*Factors of a Positive Integer*/

public class Factors_PositiveInteger {

  public static void main(String[] args) {

    // positive number
    int number = 50;

    System.out.print("Factors of " + number + " are: ");

    // loop runs from 1 to 50
    for (int i = 1; i <= number; ++i) {


      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
