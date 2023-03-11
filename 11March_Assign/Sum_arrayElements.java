/*Java Program to Find the Sum of Array Elements*/

import java.util.*;
class Sum_arrayElements{
  public static void main(String[] args){

  int sum=0;
  System.out.println("Enter the size of the array ");
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();

  int arr[]=new int[5];

  for(int i=0;i<size;i++){

  System.out.print("Give the value of index "+i+" : ");

  arr[i]=sc.nextInt();

  }

  for(int i=0;i<size;i++){

  sum=sum+arr[i];
  }
  System.out.println("Sum of array of Elements "+sum);
  }
}