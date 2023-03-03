
/* Sum of Odd or even numbers in given range*/

import java.util.Scanner;

class oddeven_sum{

      public static void main(String[] args){

      int a, sum=0;
       System.out.println("Enter the range");
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();

       if(a%2==0)
       {
       for(int i=0;i<=a;i=i+2)

       {

       sum=sum+i;
       }
       System.out.println("Sum of even number " + sum );

       }else{

       for(int i=1;i<=a;i=i+2)
       {
       sum=sum+i;
       }
         System.out.println("Sum of odd number " + sum );

       }

      }

}