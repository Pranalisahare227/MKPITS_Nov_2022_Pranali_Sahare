/*18.	Write a Java program to check whether the sequence of numbers 1, 2, 3 appears in a given array of integers somewhere. */

//19jan assign 

class Sequence_array_AssigQ18
{

  public static void main(String [] args)
  {

	int arr[]={1,4,6,1,8,3,6};

    boolean check= array123(arr);
    System.out.println(check);
  }

  public static boolean array123(int ab[])
  {
	for (int i=0; i<=ab.length-1; i++)
	{
      if(ab[i]==1 && ab[i+1]==2 && ab[i+2]==3)

      return true;
	}
	return false;
  }
}