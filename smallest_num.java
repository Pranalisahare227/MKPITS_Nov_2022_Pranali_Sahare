/*Java program to find smallest among three numbers*/

import java.util.Scanner;
class smallest_num{
  public static void main(String[] args){

  int a,b,c;
  System.out.println("Enter first number ");
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();

  System.out.println("Enter Second number ");
    b=sc.nextInt();

    System.out.println("Enter third number ");
      c=sc.nextInt();

  if(a<=b && a<=c){

  System.out.println("a is smallest");

  }

  if(b<=a && b<=c){

  System.out.println("b is smallest");

  }

  if(c<=a  && c<=b){

  System.out.println("c is smallest");

  }

  }

}
