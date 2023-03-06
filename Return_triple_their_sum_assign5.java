
/*5.Write a Java program to compute the sum of the two given integer values. If the two values are the same, then return triple their sum.*/

//19 jan assig

import java.util.Scanner;

class Return_triple_their_sum_assig5
{

  public static void main(String [] args)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter two numbers: ");
   int a=sc.nextInt();
   int b=sc.nextInt();
   int sum=a+b;

   if(a==b)
   {
	 System.out.println("The two numbers are same:-  sum = "+sum*3);
   }
   else
     System.out.println("The two numbers are different:-  sum = "+sum);

  }
}