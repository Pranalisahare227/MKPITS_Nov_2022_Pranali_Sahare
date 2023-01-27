interface one1
    {

		void fun1();


	}

	class two implements one1
	{
	 public void fun1()
	 {

		System.out.println("overriden method of Interface one");

	}
		}

class interface_demo
{

	public static void main(String [] args)
	{
		two ob = new two();
		ob.fun1();
	}
}

