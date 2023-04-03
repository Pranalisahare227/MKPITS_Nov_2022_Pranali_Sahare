/*Method Overriding */

class Animal {

  public void eat() {
    System.out.println("I can eat");
  }
}

// Dog inherits Animal
class Dog extends Animal {

  @Override
  public void eat() {
    System.out.println("I eat dog food");
  }

  public void bark() {
    System.out.println("I can bark");
  }
}

class Overriding_method {
  public static void main(String[] args) {


    Dog ob = new Dog();

    // call the eat() method
    ob.eat();
    ob.bark();
  }
}
