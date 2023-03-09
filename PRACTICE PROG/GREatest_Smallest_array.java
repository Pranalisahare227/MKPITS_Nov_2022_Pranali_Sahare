/*Java Program to find largest and smallest number in an array*/

import java.util.Scanner;

class GREatest_Smallest_array{
  public static void main(String[] args){

    int a[]=new int[5], Largest, Smallest;

   //System.out.println("Enter the size of array: ");
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter elements in Array: ");

   for(int i=0;i<5;i++){

    a[i]=sc.nextInt();

  }


   Largest=a[0];
  Smallest=a[0];

  for(int i=1;i<5;i++){

  if(a[i]>Largest){

   Largest=a[i];
   }

  if(a[i]<Smallest){

  Smallest=a[i];
}
}
   System.out.println(Largest+ " is Largest and "+ Smallest +" is Smallest");

  }

 }




