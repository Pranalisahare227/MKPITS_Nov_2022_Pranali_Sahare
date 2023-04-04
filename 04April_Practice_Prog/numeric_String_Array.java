/*Java program to sort a numeric array and a string array.*/

import java.util.Arrays;
class numeric_String_Array{
      public static void main(String[] args){

      int arr1[]={123, 234, 345, 212, 89, 456, 321, 789, 222};

      String arr2[]={"C", "Python", "Java", "C#", "Dotnet"};

      System.out.println("Original Numeric Array: "+Arrays.toString(arr1));
      Arrays.sort(arr1);

      System.out.println("Sorted Numeric Array: "+Arrays.toString(arr1));


      System.out.println("Original String Array: "+Arrays.toString(arr2));
      Arrays.sort(arr2);

      System.out.println("Sorted String Array:" +Arrays.toString(arr2));


      }

}