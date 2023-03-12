/*Java program shows the use of string in switch case.*/

public class String_in_switchcase
{
   public static void main(String[] args)
   {
       String fruit = "Mango";
       switch(fruit)
       {
           case "Mango":
               System.out.println("Sweet");
               break;
           case "Apple":
               System.out.println("Delicious");
               break;
           case "Orange":
               System.out.println("Luscious");
               break;
           default:
               System.out.println("Not a fruit");
       }
   }
}
