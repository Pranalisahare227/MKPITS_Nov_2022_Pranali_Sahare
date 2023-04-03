/* Factors of a Positive Integer*/

public class Factors_Positive_int {

  public static void main(String[] args) {

    // positive number
    int number = 50;

    System.out.print("Factors of " + number + " are: ");

    for (int i = 1; i <= number; i++) {

      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
