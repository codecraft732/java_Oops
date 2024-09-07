//here is one parent or one child but we also do multilevel inheritence 
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

//child class extend parent but its override because the method have parent its also have child with different value 
//so output shows child not parent child rebuild fathers property

public class methodOverridingCar extends Vehicle{
    void start(){
     System.out.println("car is starting");
    }

      // Main method to run the program
      public static void main(String[] args) {
        // Creating an object of the child class
        methodOverridingCar obj = new methodOverridingCar();
        obj.start(); // Calls the overridden method in the child class
    }
}
 