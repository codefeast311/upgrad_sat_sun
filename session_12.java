class session_12{


    public static void main(String[] args) {
        Car thar= new Car("Mahindra", "Thar", 2021, "Red", 1500000, 15, 2);
        thar.display();
        System.out.println("EMI: " + thar.emiCalculator(120));

        Car verna= new Car("Hyundai", "Verna", 2021, "White", 1000000, 20, 3);
        verna.display();
        System.out.println("EMI: " + verna.emiCalculator(120));

        Bike h2= new Bike("Kawasaki", "H2", 2021, "Black", 3000000, 10, 2);
        h2.display();

        Bike hayabusa= new Bike("Suzuki", "Hayabusa", 2021, "Blue", 2000000, 15, 3);
        hayabusa.display();

    }

   
}

class Bike{
    // Properties
    String name;
    String model;
    int year;
    String color;
    int price;
    int mileage;
    int distanceCanTravel;
    int fuelCapacity;

    //Parameterized Constructor

     Bike(String name, String model, int year, String color, int price,int mileage,int fuelCapacity){
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
        this.fuelCapacity = fuelCapacity;
        this.distanceCanTravel = this.mileage * this.fuelCapacity;
    }

    int getDistanceCanTravel(){
        return this.mileage * this.fuelCapacity;
    }

    //Methods
     void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
        System.out.println("Mileage: " + this.mileage);
        System.out.println("Fuel Capacity: " + this.fuelCapacity);
        System.out.println("Distance Can Travel: " + this.distanceCanTravel);
        System.out.println();
    }

    int emiCalculator(int months){
        return this.price/months;
    }

}

class Car{
    // Properties
    String name;
    String model;
    int year;
    String color;
    int price;
    int mileage;
    int distanceCanTravel;
    int fuelCapacity;

    //Parameterized Constructor

     Car(String name, String model, int year, String color, int price,int mileage,int fuelCapacity){
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
        this.fuelCapacity = fuelCapacity;
        this.distanceCanTravel = this.mileage * this.fuelCapacity;

    }

    int getDistanceCanTravel(){
        return this.mileage * this.fuelCapacity;
    }

    //Methods
     void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
        System.out.println("Mileage: " + this.mileage);
        System.out.println("Fuel Capacity: " + this.fuelCapacity);
        System.out.println("Distance Can Travel: " + this.distanceCanTravel);
        System.out.println();

    }

    int emiCalculator(int months){
        return this.price/months;
    }
}