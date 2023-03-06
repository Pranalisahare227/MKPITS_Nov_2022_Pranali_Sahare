import java.util.Scanner;

public class Java_Basics_Prog7 {
//// Simple Type

public static void addition(){

    Scanner sc = new Scanner(System.in);

    System.out.println("enter num to add");

    System.out.println("enter the first num");
    int num1 = sc.nextInt();

    System.out.println("enteer the second num");
    int num2 = sc.nextInt();

    int sum = num1+num2;

    System.out.println(sum);
}
public static void multiplication(){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter num to multiply ");

    System.out.println("Enter the first num");
    int a = sc.nextInt();

    System.out.println("Enter the second num");
    int b = sc.nextInt();

    int sum = a*b;
    System.out.println("sum");



}
    public static void main(String[] args) {

        addition();

        multiplication();

    }
}
