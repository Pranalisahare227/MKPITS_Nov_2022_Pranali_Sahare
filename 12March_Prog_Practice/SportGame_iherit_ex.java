

class Sport
 {
  void sp()
   {
    System.out.println("cricket is international sport");
   }
 }
 
 class basketball extends Sport
   {
    void playgame()
     {
      System.out.println("basketball is a team sport");
     }
   }
   
  class football extends basketball
    {
     void getequipment()
       {
        System.out.println("football is also team sport");
       }
    }
    
    public class SportGame_iherit_ex
      {
       public static void main(String[] args)
        {
         basketball b=new basketball();
           b.playgame();
           
         football f=new football();
           f.getequipment();
        }
      }