/*Check Prime or Not*/

import java.util.Scanner;
class Check_Prime_num{
   public static void main(String[] args){

   int flag=0;

   System.out.println("Enter any Number");
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();

   for(int i=2;i<n;i++){

   if(n%i==0){

   System.out.println("Number is Divisible ");
   flag=0;
   break;
   }

   else{

   System.out.println("Not Prime Number ");
    flag=1;

   }

}

   if(flag==0){

   System.out.println("Not Prime Number ");

   }else{

	      System.out.println("Prime Number ");

	   }

}
}