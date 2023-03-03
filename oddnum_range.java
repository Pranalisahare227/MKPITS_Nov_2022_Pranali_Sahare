/*Print odd numbers in Given range*/

import java.util.Scanner;

class oddnum_range{

      public static void main(String[] args){

      int n;

      System.out.println("Enter the no. of term");

      Scanner sc = new Scanner(System.in);

      n=sc.nextInt();

      for(int i=1; i<=n; i=i+2)
      {
      System.out.print(i + " ");
      }

      }

}