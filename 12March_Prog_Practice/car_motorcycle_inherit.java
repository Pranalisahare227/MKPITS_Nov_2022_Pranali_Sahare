
/*Create a parent class called "Vehicle" and create two child classes "Car" and "Motorcycle" that inherit from it. Give each child class its own unique method.*/

class vehicle
 {
	 void veh()
	 {
	  System.out.println("my vehical");
	 }
   }
  class car extends vehicle
   {
    void carname()
     {
      System.out.println("My car name is swift");
     }
   }

   class motorcycle extends vehicle
    {
     void motorcyclename()
      {
       System.out.println("my motorcycle name is Hornet");
      }
    }


  public class car_motorcycle_inherit
   {
    public static void main(String[] args)
     {
      car c=new car();
       c.carname();

       motorcycle m=new motorcycle();
        m.motorcyclename();
     }
   }