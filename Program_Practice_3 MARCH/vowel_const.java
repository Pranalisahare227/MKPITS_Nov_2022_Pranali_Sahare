/*Check Given Character is Vowel or Consonant in Java*/

import java.util.Scanner;

  public class vowel_const{
        public static void main(String[] args){
         char ch;
         System.out.println("Enter any Character ");
         Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){

        System.out.println("Character is Vowel");

        }else{

        System.out.println("Character is Constant");

        }

        }

  }