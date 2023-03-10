/*Write a Java  program to print the result of dividing two numbers. */

import java.util.Scanner;
class res_divide{
   public static void main(String[] args){

   System.out.println("Enter any two Numbers ");
   Scanner sc=new Scanner(System.in);
   int num1=sc.nextInt();
   int num2=sc.nextInt();

   int c=num1/num2;

   System.out.println("Result of dividing two numbers " +c);




   }

}