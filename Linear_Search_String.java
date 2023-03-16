
/*Linear Search Program using String*/

class Linear_Search_String{

  public static void main(String[] args){

  String[] arr={"Amit", "Palak", "Pranu", "Tejas", "Rahul"};

  String item="Tejas";
  int temp=0;

  for(int i=0;i<arr.length;i++)
  {
    if(arr[i].equals(item))

    {
     System.out.println("Item  present in "+i+" index position");
     temp=temp+1;
    }

  }

  if(temp==0)
  {

  System.out.println("Item  not present  in the list");

  }

  }
}