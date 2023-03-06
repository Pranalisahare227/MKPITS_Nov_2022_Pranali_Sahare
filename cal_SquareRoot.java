/*Program to calculate Square root of number in JavA*/

import java.util.*;
public class cal_SquareRoot
{
    public static void main(String[] args) {
        int num,sqroot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        num= sc.nextInt();
        double s = Math.sqrt(num);
        System.out.println("SquareRoot of "+num+" is " +s);

    }
}

