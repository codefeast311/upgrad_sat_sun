public class feb_3 {
    public static void main(String [] args ) {
        System.out.println("Hello, World!");
        Product p1 = new Product();
        p1.id = 1;
        p1.name = "Laptop";
        p1.price = 1000;

        Product p2 = new Product(p1);
        p2.id = 2;

        p1.print();
        p2.print();
    }
}

class Product{
    int id;
    String name;
    double price;

    public Product(){
        this.id = 0;
        this.name = "No Name";
        this.price = 0.0;
    }


    public Product(Product p){
        this.id = p.id;
        this.name = p.name;
        this.price = p.price;
    }

    void print(){
        System.out.println("id: " + this.id);
        System.out.println("name: " + this.name);
        System.out.println("price: " + this.price);
    }
}

