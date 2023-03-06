/*15.	Write a Java program to check whether two given integers are in the range 40..50 inclusive, or they are both in the range 50..60 inclusive. */

//19 jan assign

import java.util.Scanner;

class integer_range_inclusive_AssigQ15
{

    public static void main(String [] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any two numbers:  ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a = "+a);
        System.out.println("b = "+b);


        if ((a>=40 && a<=50 && b>=40 && b<=50) || (a>=50 && a<=60 && b>=50 && b<=60))
        {
		  System.out.println("The entered number is in range");
		}

		else
		{
			System.out.println("The entered number is not in range");
		}


	}
}