/*Function to remove character from String */

import java.util.Scanner;
class remove_char_fromString{
  public static void main(String[] args){

          Scanner sc= new Scanner(System.in);
          System.out.print("Enter a String : ");
          String str= sc.nextLine();
          System.out.print("Enter a Char : ");
          String ch= sc.nextLine();
          System.out.println(charToRemove(str, ch));
      }
      public static String charToRemove(String s, String ch){
          return s.replace(ch," ");
      }
  }
