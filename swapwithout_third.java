/*Swap two number without using third Variable*/

import java.util.Scanner;
class swapwithout_third{
  public static void main(String[] args){

	  int a,b;
	  System.out.println("Enter two numbers ");
	  Scanner sc=new Scanner(System.in);
	  a=sc.nextInt();
      b=sc.nextInt();


	  System.out.println("Before Swapping " +a+" "+b);

	  a=a+b;
	  b=a-b;
	  a=a-b;

	   System.out.println("After Swapping " +a+" "+b);

      }
}