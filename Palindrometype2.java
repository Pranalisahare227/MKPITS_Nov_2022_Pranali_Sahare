
import java.util.Scanner;  //Palindrome type 2

public class Palindrome_type2{

       public static void main(String[] args){

       Scanner sc=new Scanner(System.in);
      System.out.println("Enter any name");
      String a =sc.next();
      System.out.println(a);

      StringBuffer ob=new StringBuffer(a);  //string ko stringbuffer mai convert kiya
      System.out.println(ob);

      //using reverse
      ob.reverse();
      System.out.println(ob);

      String rev=new String(ob);    //string buffer ko string mai convert kiya
      System.out.println(rev);

      if(a.equals(rev))  //compare kiye normal value ko reverse value mai (to check palindrome or not)
      {
		  System.out.println("It is Palindrome");

     }

else{

	System.out.println("It is not palindrome");


	}

}

}