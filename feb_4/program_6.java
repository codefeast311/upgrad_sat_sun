package feb_4;

public class program_6 {
    public static void main(String args[]){
        //if a variable is declared as final, it means it can only be assigned once.
        final int a = 10;
    }
}

interface animal{
    //final method cannot be overridden
    final void eat();
}

// final class Animal{
//     //final class cannot be inherited
// }

class Animal{
    //final method cannot be overridden
    final void run(){
        System.out.println("Animal is running.");
    }

    //abstract method cannot be final
    abstract void sleep();
}

class Dog extends Animal{
    void run(){
        System.out.println("Dog is running.");
    }

    void sleep(){
        System.out.println("Dog is sleeping.");
    }
}
