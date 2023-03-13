

class Animal{
void eat()
{
	System.out.println("eating");
	}
}

class Dog extends Animal{
void bark()
{
	System.out.println("barking");
	}
}


class cat extends Dog{

void meow()
{
	System.out.println("meowing");
}
}

public class Multilevel_Inheritance{
public static void main(String args[]){
cat d=new cat();
d.meow();
d.bark();
d.eat();
}
}
