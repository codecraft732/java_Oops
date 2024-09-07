abstract class color{
abstract public void orange();
public void yellow(){
    System.out.println("i like yellow color");
}
}
class fruits extends color{
    public void orange(){
        System.out.println("orange is very tasty");
    }
}
public class Abstraction {
    public static void main(String[] args){
        fruits obj =new fruits();
        obj.yellow();
        obj.orange();
    }
}
