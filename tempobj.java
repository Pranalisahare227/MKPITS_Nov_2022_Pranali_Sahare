class adddemo1
{
 private int a,b;

 void set( int x,int y)
 {
 a=x;
 b=y;
 }
 adddemo1 sum(adddemo1 cob1, adddemo1  cob2)
 {
   adddemo1 tempob = new adddemo1();
   tempob.a = a+cob1.a+cob2.a;
   tempob.b = b+cob1.b+cob2.b;
   return tempob;
   }
   void disp()
   {
   System.out.println(a);
   System.out.println(b);

   }
 }
 class tempobj
 {
 public static void main (String[]args)
 {
 adddemo1 ob1 = new adddemo1();
 adddemo1 ob2 = new adddemo1();
 adddemo1 ob3 = new adddemo1();
 adddemo1 ob4 = new adddemo1();
 ob1.set(12,13);
 ob2.set(14,23);
 ob3.set(16,32);
 ob4 = ob1.sum(ob2,ob3);
 ob4.disp();
 }
 }