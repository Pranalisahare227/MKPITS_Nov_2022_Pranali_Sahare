/*Print array elements in reverse order*/

import java.util.*;
class array_reverse{
   public static void main(String[] args){
    int a[]=new int[5];

    System.out.println("Enter Elements in an array: ");
    Scanner sc=new Scanner(System.in);

    for(int i=0;i<a.length;i++)
    {

    a[i]=sc.nextInt();

    }

   System.out.println(" Array Elements: ");
   for(int i=0;i<a.length;i++)
       {

      System.out.print(a[i]+ " ");

       }
System.out.print("\n Reverse Elements :");
     for(int i=a.length-1;i>=0;i--)
     {

    System.out.print(a[i]+ " ");


    }

   }
}