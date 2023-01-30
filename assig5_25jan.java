/* Write a java program to create a new array of length 3 from a given array (length atleast 3)
containing the elements from the middle of the array. */

class assig5_25jan
{
  public static void main(String [] args)
  {
    int [] arr = { 2, 5 ,4 ,6 ,8 ,9,3};

    int [] arrNew = { arr[3],arr[4],arr[5],arr[6]};

        System.out.print("arrNew [] : ");

    for(int i = 0;i<arrNew.length;i++)
    {
       System.out.print(arrNew[i]+" ");
    }
  }
}
