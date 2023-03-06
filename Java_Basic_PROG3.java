import java.util.Scanner;

public class Java_Basic_PROG3{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        my_method(a,b);

    }

    public static void my_method(int x , int y){
        int sum;
        sum = x+y;
        System.out.println(sum);

    }
}
