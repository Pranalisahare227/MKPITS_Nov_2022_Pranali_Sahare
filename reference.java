class adddemo
{

	int a=2,b=4;
    int res;

	void sum()
	{
		res=a+b;
     }

     void dis()
     {
		 System.out.println(res);
	 }

 }


public class reference{
    public static void main(String[]args){

    adddemo ob=new adddemo();

    ob.sum();
    ob.dis();

    adddemo ob2=ob;

    ob2.dis();

    ob2.a=12;
    System.out.println(ob2.a);
    ob2.dis();

}

}
