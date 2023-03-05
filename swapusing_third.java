/*Swapping of two numbers using third variable*/

import java.util.Scanner;
class swapusing_third{
 public static void main(String[] args){

	 int a,b,temp;
	 System.out.println("Enter two numbers ");
	 Scanner sc=new Scanner(System.in);
	 a=sc.nextInt();
	 b=sc.nextInt();

	 System.out.println("Before Swapping "+a+" "+b);

	 temp=a;
	 a=b;
	 b=temp;

	 System.out.println("After Swapping "+a+" "+b);

 }

}