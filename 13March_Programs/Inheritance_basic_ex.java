

class Senior
{
 float salary=40000;
}

class Employee extends Senior
{
 int bonus=5000;
}

 public class Inheritance_basic_ex{

 public static void main(String args[]){
   Employee p=new Employee();
   System.out.println("Employee salary is:"+p.salary);
   System.out.println("Bonus of Employee is:"+p.bonus);
}
}


