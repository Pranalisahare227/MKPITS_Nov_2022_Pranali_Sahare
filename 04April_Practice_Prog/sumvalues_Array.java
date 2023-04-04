
/*Java program to sum values of an array.*/

class sumvalues_Array{

   public static void main(String[] args){
   
   int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
   
   int sum = 0;
   
   for(int i : arr)
   
   sum = sum + i;
   
   System.out.println("Sum is " +sum);
    
   }

}