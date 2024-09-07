//this keyword example
class Vehicle {
    int modle;
    void start() {
        System.out.println("this");
        System.out.println(this.modle+"Vehicle is starting");
    }
}

public class Car extends Vehicle {
    String color;
    public static void main(String[] args) {
       Car obj = new Car(); 
        obj.modle=110;
        obj.color="yellow";
        obj.start(); 
    }
}


