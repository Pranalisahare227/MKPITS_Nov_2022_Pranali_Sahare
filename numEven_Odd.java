/*check given number is Even or Odd*/

import java.util.Scanner;

class numEven_Odd{
  public static  void main(String[] args){
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
       n=sc.nextInt();

      if(n%2==0){
      System.out.println(n+ " is even");
      }else{

      System.out.println(n+ " is odd");
      }

      }

 }
