import java.util.Scanner;

public class Java_Basics_Prog9 {

    /// Taking Return

    public static int addition(int num1,int num2){

        int sum = num1+num2;

        return sum;
    }
    public static int multiplication(int a , int  b){


        int sum = a*b;
        return sum ;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num to add");

        System.out.println("enter the first num");
        int num1 = sc.nextInt();

        System.out.println("enteer the second num");
        int num2 = sc.nextInt();
        int sum1 = addition(num1 , num2);
        System.out.println(sum1);
        ////////////////////////////////////////////////////////////////////

        System.out.println("Enter num to multiply ");

        System.out.println("Enter the first num");
        int a = sc.nextInt();

        System.out.println("Enter the second num");
        int b = sc.nextInt();
       int sum2 = multiplication(a,b);
        System.out.println(sum2);
    }
}
