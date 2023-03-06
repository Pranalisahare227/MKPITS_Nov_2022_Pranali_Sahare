/*Perfect number program in Java*/

import java.util.Scanner;

class Perfect_num{

  public static void main(String[] args){
   int n,sum=0;
   System.out.println("Enter any number");
   Scanner sc=new Scanner(System.in);
    n=sc.nextInt();

    for(int i=1;i<n;i++){

    if(n%i==0){

    sum=sum+i;

    }

 }

 if(n==sum){
 System.out.println("Number is Perfect number");

 }else{

 System.out.println("Not Perfect number");

 }

  }

}