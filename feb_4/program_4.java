package feb_4;
//Upcasting is the typecasting of a child object to a parent object.
public class program_4 {
    public static void main(String args[]){
        Animal animal = new Animal();
        Cat cat = new Cat();
        makeAnimalRun(animal);
        makeAnimalRun(cat);
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
    public void drinkMilk() {
        System.out.println("Cat is drinking milk.");
    }
 
    public void sayMeow() {
        System.out.println("Meow! Meow!");
    }

  
     
 }
 