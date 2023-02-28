//Java Program to calculate the sum of array elements

public class array_sum{
  public static void main(String[] args){

  int a[]={1,2,3,4,5};  //initialize
  int sum=0;

   for(int i=0;i<a.length;i++){

   sum+=sum+a[i]; //add array

   System.out.println("Sum of array elements is " +sum);

   }

  }

}