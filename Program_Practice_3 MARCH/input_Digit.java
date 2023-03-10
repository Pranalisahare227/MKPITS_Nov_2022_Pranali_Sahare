/*Java Program to check given input isDigit or not*/

import java.util.Scanner;
class input_Digit{
    public static void main(String[] args){
     char ch;
     System.out.println("Enter a Character");
     Scanner sc=new Scanner(System.in);
     ch=sc.next().charAt(0);

     if(ch>='0'  && ch<='9'){

     System.out.println("Character is Digit ");

     }else{

          System.out.println("Character is not Digit ");

     }

    }
}