import java.util.Scanner;

public class Java_Basic_mul_add_PROG6 {

    public static int multiply(int a,int b){
        int sum = a*b;
        return sum;

    }

    public static int addition(int a , int b){
        int sum1 = a +b ;
        return sum1 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first num");
        int a = sc.nextInt();

        System.out.println("Enter the second num");
        int b = sc.nextInt();

       int sum = multiply(a,b);
        System.out.println(sum);


      int sum1 =  addition(a,b);
        System.out.println(sum1);

    }
}
