package feb_4;

public class program_2 {
    public static void main(String args[]){
        Dog dog = new Dog("Tommy", "Black");
        dog.sound();
        dog.bark();
        System.out.println(dog.color);
        System.out.println(dog.name);
    }
}

//Inheritance is a mechanism in which one class acquires the properties and behavior of another class.

class Animal{
    //Properties 
    String color;

    //Constructor
    Animal(String color){
        this.color = color;
    }

    //Methods
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    //Properties
    String name;

    //Constructor
    Dog(String name, String color){
        super(color);
        this.name = name;
        
    }

    //Methods
    public void bark(){
        System.out.println("Dog barks");
    }
}
