/*Print ASCII value of character*/

import java.util.Scanner;

class ASCII_value{
    public static void main(String[] args){
      char ch;
      System.out.println("Enter any Character");
      Scanner sc=new Scanner(System.in);
     ch=sc.next().charAt(0);


    int b=ch;
    System.out.println("ASCII value of "+ch +" is " +b);

    }


}