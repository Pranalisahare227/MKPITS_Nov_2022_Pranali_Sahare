interface one1
    {

         void fun1();
	}

interface two2
{

  void fun2();
}

class three implements one1,two2
	{
	 public void fun1()

	 {
	System.out.println("overriden method of Interface one1");
	}
	 public void fun2()

		 {
		System.out.println("overriden method of Interface two2");
	}
		}

class interface_demo2{

	public static void main(String [] args)
	{
		three ob = new three();
		ob.fun1();
		ob.fun2();
	}
}


