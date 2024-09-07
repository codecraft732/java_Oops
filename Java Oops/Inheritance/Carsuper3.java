// Child class Carsuper3 extending Vehiclesuper
public class Carsuper3 extends Vehiclesuper3 {
    String color;
    // Constructor for Carsuper3
    public Carsuper3() {
        //if i pass it nothing 
        //super()
        //then it call default constructor which is this // creating a vehicle instance 
        //then wheels count parent or child not print print default or next start constructor parent child
        super(3);
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
        Carsuper3 obj = new Carsuper3(); // Creating an instance of Carsuper2
        obj.wheelsCount=4;
        System.out.println(obj.wheelsCount);
        obj.start(); // Calls the overridden start method
    }
}
/*  out put is this first carsuper3 extend vehiclesuper3 super keyword first print parent property then child 
then start method call super keyword first print parent property then child 

//3 because parent constructor pass value 3 in super
3 Creating vehicles with wheels 
car is being created
//but after we updated so wheelcount value is 4
4
vehicle is starting
car is starting*/