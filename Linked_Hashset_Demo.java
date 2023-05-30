import java.util.LinkedHashSet;
import java.util.Scanner;


public class Linked_Hashset_Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        LinkedHashSet al=new LinkedHashSet();
        System.out.println(al.size());
        String s=sc.next();
        char[] chars = s.toCharArray();

        for (int i = 0; i <s.length(); i++) {
            al.add(chars[i]);

        }

        System.out.println(al.size());
        System.out.println(al);

    }
}

