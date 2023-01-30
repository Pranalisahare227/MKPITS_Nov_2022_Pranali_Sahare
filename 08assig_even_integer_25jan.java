
// 8.	Write a C program to count even number of elements in a given array of integers.

import java.util.*;
public class assig8_even_integer25jan {
 public static void main(String[] args)
 {
    int[] nums = {5, 7, 2, 4, 9};
	int even = 0;
	System.out.println("Original Array: ");

    for(int i = 0; i < nums.length; i++)
    {
        if(nums[i] % 2 == 0)
		{
          even++;
	    }


         System.out.println("\nNumber of even elements in the array: %d",even);

	     System.out.println("\n");
  }
}

}


