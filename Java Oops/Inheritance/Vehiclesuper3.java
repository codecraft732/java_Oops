//super keyword3
public class Vehiclesuper3{
    int wheelsCount;
    int modle;

    // Constructor for Vehiclesuper3
    public Vehiclesuper3() {
        System.out.println("creating a vehicle instance");
    }
//constructor

Vehiclesuper3(int wheelsCount){
this.wheelsCount=wheelsCount;
System.out.println(wheelsCount+" Creating vehicles with wheels ");
}

    // Method in the parent class
    void start() {
        System.out.println("vehicle is starting");
    }
}
