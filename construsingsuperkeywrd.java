class one{
   one(int x, int y)

   {
     System.out.println(x+"  "+y);
   }
}

class two extends one{
  two()
  {
  super(1,2);  //2nd use of super()

  }
}


public class construsingsuperkeywrd{
   public static void main(String[] args) {
   two ob=new two();


}

}
