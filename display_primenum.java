/*Display all Prime numbers from 1 to N*/

import java.util.Scanner;
class display_primenum{
    public static void main(String[] args){

     int n;
     System.out.println("Enter number : ");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     System.out.println("Prime numbers btween 1 and " + n);


     for(int i=1;i<n;i++)
     {
     boolean isPrime=true;
     //check to see the number is Prime

     for(int j=2;j<i;j++)
     {
      if(i%j==0)
      {
      isPrime=false;
      break;

      }

     }

     if(isPrime){  //print the num

     System.out.print(i + " ");

     }
     }
  }
}
