/*Java program to find greatest of three numbers*/

import java.util.Scanner;
class greatest_num{
  public static void main(String[] args){

  int a,b,c;
  System.out.println("Enter first number ");
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();

  System.out.println("Enter Second number ");
    b=sc.nextInt();

    System.out.println("Enter third number ");
      c=sc.nextInt();

  if(a>=b && a>=c){

  System.out.println("a is greatest");

  }

  if(b>=a && b>=c){

  System.out.println("b is greatest");

  }

  if(c>=a  && c>=b){

  System.out.println("c is greatest");

  }

  }

}