interface one1
    {

         void fun1();
	}


class two2
    {

       public void fun2()

		   		 {

		   		System.out.println("Hello");

		         }


		   }

class three extends two implements one1
	{
	 public void fun1()

	 {

	System.out.println("three extends two implement");

	}

	}

class interface_demo3{

	public static void main(String [] args)
	{
		three ob = new three();
		ob.fun1();

	}
}


