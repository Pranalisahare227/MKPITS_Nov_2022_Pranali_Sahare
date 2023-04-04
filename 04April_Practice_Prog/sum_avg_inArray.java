/*Java program to calculate the average value of array elements.*/

import java.util.*;

  class sum_avg_inArray{

    public static void main(String[] args){

    int arr[]=new int[5];
    int sum = 0;

    System.out.println("Enter Array Elements ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=0; i<arr.length; i++){

    sum=sum+arr[i];

    }

    double avg = sum / arr.length;

    System.out.println("Average value of array elements is " + avg);


    }


  }