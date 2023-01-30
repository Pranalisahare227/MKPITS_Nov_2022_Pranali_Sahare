class one{
   void dis()
   {
     System.out.println("one class");
   }
}

class two extends one{
  void dis()
  {
super.dis();        //accessing one class dis method
  System.out.println("two class");

  }
}


public class overridingusingsuperkeyword{
   public static void main(String[] args) {
   two ob=new two();
   ob.dis();

}

}