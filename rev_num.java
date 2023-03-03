
//Reverse number in java
//input number=123

import java.util.Scanner;

public class rev_num{

   public static void main(String[] args){

   int n, r ;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter any number");
   n=sc.nextInt();

   while(n>0)
   {

   r=n%10;
   System.out.print(r);
   n=n/10;

   }


   }

}
