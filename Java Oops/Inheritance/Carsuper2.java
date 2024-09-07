// Child class Carsuper2 extending Vehiclesuper
public class Carsuper2 extends Vehiclesuper2 {
    String color;

    // Constructor for Carsuper2
    public Carsuper2() {
        System.out.println("car is being created");
    }

    // Overriding the start method
    @Override
    void start() {
        super.start(); // Calls the start method from the parent class
        System.out.println("car is starting");
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Carsuper2 obj = new Carsuper2(); // Creating an instance of Carsuper2
        obj.modle = 110; // Setting the model value
        obj.color = "yellow"; // Setting the color value
        obj.start(); // Calls the overridden start method
    }
}

/* output  super keyword use in method but it also affect in constructor first run previous parent class then current class
creating a vehicle instance //this is because super keyword call a previous  class constructor
car is being created        //this is car constructor call from call method 
vehicle is starting         //this is because super call first previous  class method
car is starting             //then call current 
*/

