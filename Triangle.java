
import java.util.Scanner;

class Triangle{
   public static void main(String[] args) {

	Scanner input=new Scanner(System.in);
   System.out.println("Enter the width or base of the triangle:");
   double base=input.nextDouble();

   System.out.println("Enter the height of the triangle: ");
   double height=input.nextDouble();

   //Area of triangle equation
   double area=(base*height)/2;

   System.out.println("Area of Triangle is: "+area);
  }


}


