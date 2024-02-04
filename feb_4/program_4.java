package feb_4;
//Upcasting is the typecasting of a child object to a parent object.

//Downcasting is the typecasting of a parent object to a child object.

//Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than at compile-time.
public class program_4 {
    public static void main(String args[]){
        //Upcasting
        Animal animal = new Animal();
        Cat cat = new Cat();
        makeAnimalRun(animal);
        makeAnimalRun(cat);

        //Downcasting
        // Animal animal1 = new Cat();
        // System.out.println("animal1 is Cat? " + (animal1 instanceof Cat));
        // System.out.println("animal1 is Animal? " + (animal1 instanceof Animal));
        // System.out.println("animal1 is Object? " + (animal1 instanceof Object));

        // Animal animal2 = new Animal();
        // System.out.println("animal2 is Cat? " + (animal2 instanceof Cat));
        // System.out.println("animal2 is Animal? " + (animal2 instanceof Animal));
        // System.out.println("animal2 is Object? " + (animal2 instanceof Object));

        System.out.println(cat);
        System.out.println(animal);


    }

    public static void makeAnimalRun(Animal animal) {
        animal.run();
     }
}
class Animal {
    public void run() {
        System.out.println("Animal is running.");
    }
    public void sleep() {
        System.out.println("Animal is sleeping.");
    }
 }
 
 class Cat extends Animal {

    //Method Overridig is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
    public void run() {
        System.out.println("Cat is running.");
    }

    public void sleep() {
        System.out.println("Cat is sleeping.");
    }

    public void drinkMilk() {
        System.out.println("Cat is drinking milk.");
    }
 
    public void sayMeow() {
        System.out.println("Meow! Meow!");
    }

    public String toString() {
        return "Cat";
    }

  
     
 }
 