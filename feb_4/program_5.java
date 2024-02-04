package feb_4;

public class program5 {
    public static void main(String args[]){
        cat c = new cat();
        c.eat();
        c.sleep();
    }
    
}

interface animal{
    void eat();
    void sleep();
}

class cat implements animal{
    public void eat(){
        System.out.println("Cat is eating");
    }
    public void sleep(){
        System.out.println("Cat is sleeping");
    }
}