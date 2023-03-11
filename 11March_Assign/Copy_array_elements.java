/*Copy Array Elements */

//first a[] and second b[] should be Same

import java.util.*;

class Copy_array_elements{
       public static void main(String[] args){

       int a[]=new int[5];
       int b[]=new int[5];

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter value in first array ");

       for(int i=0;i<5;i++)
       {

       a[i]=sc.nextInt();

       }

       System.out.println("First array Elements ");

       for(int i=0;i<5;i++)
              {

              System.out.print(a[i]+ " ");

              }

        System.out.println("\nSecond array Elements ");

       for(int i=0;i<5;i++)
              {

              b[i]=a[i];

       System.out.print(b[i]+" ");

       }
}
}