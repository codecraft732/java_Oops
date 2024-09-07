//super keyword example
//super keyword use to call constructor parent constructor
public class Carsuper extends Vehiclesuper {
    String color;
    void start(){
        //because of super first it print previous method vehicle starting then car starting
        super.start();
        System.out.println("car is starting");
}

public static void main(String[] args) {
    Carsuper obj = new Carsuper(); 
    obj.modle=110;
    obj.color="yellow";
    obj.start(); 
}
}