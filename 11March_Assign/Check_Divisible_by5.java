/*Java Program to Find the Number of Integers Divisible by 5*/

import java.util.Scanner;
public class Check_Divisible_by5
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        if(n % 5 == 0)
        {
            System.out.println(n+" is divisible by 5");
        }
        else
        {
            System.out.println(n+" is not divisible by 5");
        }
    }
}
