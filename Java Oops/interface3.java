//one interface implement one class then 2nd class
interface animal{
public void run();
}
class Tiger implements animal{
    public void run(){
    System.out.println("tiger is running");
    }
}
class Lion implements animal{
public void run(){
    System.out.println("lion is running");
    }
}
public class interface3 {
    public static void main(String[] args){
        animal tiger= new Tiger();
        tiger.run();   
        animal lion= new Lion();
        lion.run();    }
}
