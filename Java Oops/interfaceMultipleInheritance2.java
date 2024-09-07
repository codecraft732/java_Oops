//one interface implement one class then 2nd class
interface car{
    public void start();
}
class ElectricCar implements car{
    public void start(){
        System.out.println("electric car is starting .");
    }
}
class DeselCar implements car{
    public void start(){
        System.out.println("desel car is starting .");
    }
}
public class interfaceMultipleInheritance2 {
    public static void main(String[] args){
        car texla= new ElectricCar();
        car xyz=new DeselCar();
        texla.start();
        xyz.start();
    }
}
