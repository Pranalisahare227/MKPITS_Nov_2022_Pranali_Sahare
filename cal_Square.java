
/*Program to calculate square of number in JavA*/

import java.util.*;
public class cal_Square
{
    public static void main(String[] args) {
        int num,square;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        num= sc.nextInt();
        square = num*num;
        System.out.println("Square of "+num+" is " +square);

    }
}
