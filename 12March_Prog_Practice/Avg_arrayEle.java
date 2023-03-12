/*Find Average of array elements*/

import java.util.*;
class Avg_arrayEle{

     public static void main(String[] args){

     int a[]=new int[5];
     int sum=0; double avg;

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter array Elements ");
      for(int i=0;i<5;i++)
      {

      a[i]=sc.nextInt();

      }

      System.out.println("Array Elements are ");
            for(int i=0;i<5;i++)
            {

            System.out.print(a[i]+  " ");

            }
      for(int i=0;i<5;i++)
            {

            sum=sum+a[i];

            }

     avg=sum/5.0;

     System.out.println("\nADDition is "+sum+ "\nAVAERAGE " +avg);









     }

}