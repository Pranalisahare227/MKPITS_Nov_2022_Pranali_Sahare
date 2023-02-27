
//Basic Relational Operator (True/False)

import java.util.Scanner;
public class Relational{
   public static void main(String[] args) {

       int a, b;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter two numbers");
       a=sc.nextInt();
       b=sc.nextInt();

       System.out.println("True/False " +(a>b));
       System.out.println("True/False " +(a<b));
       System.out.println("True/False " +(a>=b));
       System.out.println("True/False " +(a<=b));
       System.out.println("True/False " +(a!=b));
       System.out.println("True/False " +(a==b));



   }

}

