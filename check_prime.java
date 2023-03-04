/* To CHECK Number is Prime or Not*/

import java.util.Scanner;
class check_prime{
  public static void main(String[] args){

   int n, count=0;
   System.out.println("Enter number : ");
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();

   for(int i=1;i<=n;i++)
   {

   if(n%i==0)
   {
   count++;
   }
}

if(count==2)

System.out.println("Number is Prime");

 else

 System.out.println("Number is not Prime");

}

}