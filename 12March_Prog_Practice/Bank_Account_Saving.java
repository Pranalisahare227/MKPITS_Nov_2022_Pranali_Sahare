
/*Create a class called "BankAccount" that has a balance field and a method to deposit money into the account. Create two child classes "CheckingAccount" and "SavingsAccount" that inherit from it.*/

class BankAccount
 {
  void BA()
   {
    System.out.println("Create Bank Account");
   }
 }

 class checking extends BankAccount
   {
    void check()
      {
       System.out.println("checking Bank Account");
      }
   }

   class saving extends BankAccount
     {
      void save()
        {
         System.out.println("Saving Account");
        }
     }

     public class Bank_Account_Saving
      {
       public static void main(String[] args)
        {
         checking c=new checking();
          c.check();
         saving s=new saving();
          s.save();
        }
     }