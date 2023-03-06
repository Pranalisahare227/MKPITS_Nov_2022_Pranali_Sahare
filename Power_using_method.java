


/*  to calculate Power using POW() method*/

import java.util.*;
public class Power_using_POW
{
    public static void main(String[] args) {
        int base,exponent;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number");
        base= sc.nextInt();
        System.out.println("Enterthe exponent number");
        exponent= sc.nextInt();
        System.out.println(base+" to the power "+exponent);
        double res = Math.pow(base, exponent);
        System.out.println(res);
    }
}