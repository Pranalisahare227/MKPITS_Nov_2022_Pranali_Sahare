/* 17.	Write a Java program to check if two given non-negative integers have the same last digit. */

//19jan assign

import java.util.Scanner;

class neg_same_lastdigit_AssigQ17
{

    public static void main(String [] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any two numbers:  ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        int same1= lastDigit(a);
        int same2= lastDigit(b);

        if(same1==same2)
        {
         System.out.println("Both numbers have Same last digits");
     	}
     	else
     	 System.out.println("Both numbers dont have Same last digits");
	}


	  public static int lastDigit(int x)
	  {
        int n=x%10;

           return n;
	  }
}