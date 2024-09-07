//2 interfaces implements in one classes
interface A{
    public void run();
}
interface B{
    public void run();
}
class C implements A,B{
    public void run(){
        System.out.println("c is running");
    }
}
public class interfacemultipleInheritence {
    public static void main(String[] args){
            C obj =new C();
            obj.run();
    }
}
