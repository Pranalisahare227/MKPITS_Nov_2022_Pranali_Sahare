/*Java Program to print all odd numbers in array.*/

import java.util.*;

class OddNum_array{
public static void main(String[] args){

System.out.println("Enter the Size of Array ");
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();

int arr[]=new int[size];

System.out.println("Enter the Number of elements in Array ");

for(int i=0;i<size;i++){

arr[i]=sc.nextInt();

}

System.out.println("Odd Elements are ");

for(int i=0;i<size;i++){

if(arr[i]%2!=0)

System.out.print(arr[i]+ " ");

}
}

}