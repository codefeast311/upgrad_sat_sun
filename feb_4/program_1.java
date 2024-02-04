public class feb_4 {
    public static void main(String args[]){

        Car car1 = new Car(100, "Audi");
        car1.setSpeed(200);
        System.out.println(car1.getSpeed());
    }
}

class Car{
    private int speed;
    String name;

    Car(int speed, String name){
        this.speed = speed;
        this.name = name;
    }

    //Getter method
    public int getSpeed(){
        return speed;
    }

    //Setter method

    public void setSpeed(int speed){
        this.speed = speed;
    }
}
