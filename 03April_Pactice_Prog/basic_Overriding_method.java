class shape{

public void set(){

System.out.println("Can't Say Shape Type ");

}

}

class square extends shape{

  @Override
   public void display(){

   System.out.println("Square Shape ");

  }
}
class basic_Overriding_method{
 public static void main(String[] args){

 square ob = new square();

 ob.set();

 ob.display();

 }

}

