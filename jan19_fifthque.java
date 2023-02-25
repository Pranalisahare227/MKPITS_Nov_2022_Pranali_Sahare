//5.Write a java program to compute the sum of the two given integer values. If the two values are the same, then return triple their sum.

import java.util.Scanner;

class que5
{
   int n1,n2,sum;
   void collect()
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter 1st Integer");
   n1=sc.nextInt();//input variable
   System.out.println("Enter 2nd Integer");
   n2=sc.nextInt();

   }

   void calc()
   {
   sum=n1+n2;
   //condition
   if(n1==n2)
   {
   System.out.println("" +((n1+n2)*3));
   }
   else
   {
   System.out.println(sum);
   }
   }
 }

   public class jan19_fifthque {
   public static void main(String[] args) {
   que5 ob = new que5();
   ob.collect();
   ob.calc();

   }

   }
