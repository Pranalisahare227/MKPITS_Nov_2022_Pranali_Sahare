/*Program to Calculate Simple Interest*/

import java.util.*;
public class Calculate_SimpleInterest
{
    public static void main(String[] args) {
        float p, t, r, SI;
        System.out.println(" Simple Interest Program" );
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle Amount");
        p= sc.nextFloat();
        System.out.println("Enter the time Duration");
        t= sc.nextFloat();
        System.out.println("Enter the Rate of Interest");
        r= sc.nextFloat();
        SI = (p * t * r) / 100;
        System.out.println("Simple Interest = " +SI);
    }
}