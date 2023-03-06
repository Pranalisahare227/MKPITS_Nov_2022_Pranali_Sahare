import java.util.*;

class check_Palindrome_string{

public static void main(String [] argu){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the name :");
String str= sc.nextLine();

StringBuffer ob = new StringBuffer(str);

ob.reverse();

String data = ob.toString();// to store object into another string variable method in string buffer
//<----------------------only used in buffer-------------------------->


// System.out.println(ob);/// printing reverse



if(str.equals(data)){

	System.out.println(data+" is a palindrome");

	}

else{

	System.out.println(str+" Not a palindrome ");

	}
}


}