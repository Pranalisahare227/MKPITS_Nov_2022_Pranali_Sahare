/*Java Program to Print All Even Numbers in Array */

import java.util.*;
class EvenNum_array{
   public static void main(String[] args){

 System.out.println("Enter the size of array: ");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();

 int arr[]=new int[n];

System.out.println("Enter numbers in Array are: ");

 for(int i=0;i<n;i++)
 {

 arr[i]=sc.nextInt();

 }

System.out.print("Even Elements are ");

 for(int i=0;i<n;i++)
 {
 if(arr[i]%2==0)

 System.out.print(arr[i]+ " ");

 }

   }

}