/*Java Inheritance*/

class Travel{

String name;

void display(){

System.out.println("I like to Travel");

}
}

class Manali extends Travel
{

void set(){

System.out.println("My name is "+name);

}
}

class basic_Inheritance{
   public static void main(String[] args){

   Manali ob = new Manali();

   ob.name = "King";

   ob.set();

   ob.display();


}

}
