import java.util.Scanner;

class multiply3num
{
   public static void main(String[] args)
   {
     int n1,n2,n3,mul; //collecting data from user
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 1st number");
     n1=sc.nextInt();

     System.out.println("Enter 2nd number");
     n2=sc.nextInt();

     System.out.println("Enter 3rd number");
      n3=sc.nextInt();


   mul=n1*n2*n3; //output of multiplication
   System.out.println("multiplication is "+mul);

   }

}