/*Check positive or negative*/
    import java.util.Scanner;
    class CheckPosit_NEGATIVE
    {
    public static void main(String[] args)
    {
    int num;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    num = sc.nextInt();

    if(num>0)
    {
    System.out.println("The number is positive.");
    }

    else if(num<0)
    {
    System.out.println("The number is negative.");
    }
    //executes when the above two conditions return false
    else
    {
    System.out.println("The number is zero.");
    }
    }
    }