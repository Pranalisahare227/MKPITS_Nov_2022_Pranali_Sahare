// natural num sum

import java.util.Scanner;
public class natural_sum{

     public static void main(String[] args){

     int n, sum=0;

     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the term of number ");
     n=sc.nextInt();

     for(int i=1;i<=n;i++){
     sum=sum+i;
      }

     System.out.print("Addition " +sum);

     }
  }




