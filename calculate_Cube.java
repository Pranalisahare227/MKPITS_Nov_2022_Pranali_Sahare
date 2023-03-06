/*Program to calculate cube of number in JavA*/

import java.util.*;
public class calculate_Cube
{
    public static void main(String[] args) {
        int num,cube;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        num= sc.nextInt();
        cube = num*num*num;
        System.out.println("Cube of "+num+" is " +cube);
        
    }
}

