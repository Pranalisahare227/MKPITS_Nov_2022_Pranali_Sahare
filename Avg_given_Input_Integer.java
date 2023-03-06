/*Java Program to calculate Average of Given Input Integer*/

import java.util.*;
public class Avg_given_Input_Integer
{
    public static void main(String[] args) {
        float sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        float arr[] = new float[n];
        System.out.println("Enter " + n + " array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            sum=sum+arr[i];
        }
        float average = sum/n;
        System.out.println("Average of number is : "+average);
    }
}