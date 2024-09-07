
class A{
public void print(){
    System.out.println("this is method A");
}
}
class B extends A{
    public void printB(){
        System.out.println("this is method B");
    }
}
class C extends A{
    public void printC(){
        System.out.println("this is method C");
    }
}

    
public class hierarchicalinheritance {
    public static void main(String[] args){
        B obj= new B();
        C obj1 = new C();
        obj.print();
        obj1.print();
    }
}
