package feb_4;
//Method Overloading is a feature that allows a class to have more than one method having the same name, if their parameter lists are different.
//Method Overloading is also known as Static Polymorphism or Compile time Polymorphism.

public class program_3 {
    public static void main(String args[]){

        // Overloaded obj = new Overloaded();
        // obj.display(10);
        // obj.display(10, 20);
        // obj.display("Hello");
        // System.out.println(obj.display(10, 20, 30));

        MathOverloaded obj = new MathOverloaded();
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10.5, 20.5);

        System.out.println(obj);

    }
}

class Overloaded{
     void display(int a){
        System.out.println("Integer: "+a);
    }

     void display(int a, int b){
        System.out.println("Integer: "+a+" "+b);
    }

     void display(String a){
        System.out.println("String: "+a);
    }

    int display(int a, int b, int c){
        System.out.println("Integer: "+a+" "+b+" "+c);
        return a+b+c;
    }
}


class MathOverloaded{
    void add(int a, int b){
        System.out.println(a+b);
    }

    void add(int a,int b,String c){
        System.out.println(a-b);
    
    }

    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    void add(double a, double b){
        System.out.println(a+b);
    }
}