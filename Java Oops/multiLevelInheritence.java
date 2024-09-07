public class multiLevelInheritence {
    public static void main(String[] args){
        C obj =new C();
        obj.c();
        obj.a();
        obj.b();
    }
}
class A{
void a(){
    System.out.println("this is class A.");
}
}
class B extends A{
    void b(){
        System.out.println("this is class B.");
    }
}
class C extends B{
    void c(){
        System.out.println("this is class c.");
    }
}