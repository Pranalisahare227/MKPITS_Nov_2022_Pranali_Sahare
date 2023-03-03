/*Sum of digits Program*/

import java.util.Scanner;

class sum_digits{
   public static void main(String[] args) {
   int n,r,sum=0;

   Scanner sc=new Scanner(System.in);
   System.out.print("Enter any number ");
   n=sc.nextInt();

  while(n>0)
  {
    r=n%10;
    System.out.print(r);
    sum=sum+r;
    n=n/10;

  }

  System.out.print("Sum of digits " + sum);

}

}