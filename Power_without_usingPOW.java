
import java.util.*;
public class Power_without_usingPOW
{
    public static void main(String[] args) {
    int base,exponent,res=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter base number");
    base= sc.nextInt();
    System.out.println("Enter exponent number");
    exponent= sc.nextInt();
    System.out.println(base+" to the power "+exponent);
    while (exponent != 0) {
        res = base * res;
        exponent--;
    }
    System.out.println(res);
    }
}
