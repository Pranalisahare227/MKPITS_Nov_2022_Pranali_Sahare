import java.util.Scanner;

public class arithmetic{
   public static void main(String[] args){

   int a,b;


   Scanner sc=new Scanner(System.in);
   System.out.println("Enter two numbers");
   a=sc.nextInt();
   b=sc.nextInt();

   System.out.println("Add " +(a+b));
   System.out.println("Sub " +(a-b));
   System.out.println("Mul " +(a*b));
   System.out.println("Div " +(a/b));




   }

}