/*Java Program to calculate factorial using recursion*/

import java.util.Scanner;
class factorial_recursion{
  public static void main(String[] args){

int n;
  System.out.println("Enter any number ");
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();

  factorial_recursion ob=new factorial_recursion();
  int result=ob.fact(n);  //n=6
  System.out.println("Factorial of a given number : " +result);

 }

 int fact(int n){

   if(n==1)
   return 1;

   else
   return n*fact(n-1);

 }
}

