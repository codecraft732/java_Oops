//two types of polymorphism run time or compile time
public class compiletimepolymorphism{
    public static void main(String[] args) {
        person p1=new person();
        p1.age=12;
        p1.name="alishba";
       

        person p2=new person();
        p2.age=16;
        p2.name="maryam";

        System.out.println(p1.name+" "+p1.age);
        System.out.println(p2.name+" "+p2.age);
        p1.eat();
      
        //put cursor on walk press control e it highlights which one is this
        // 2 walk methods  parametric or non parametric that's calles compile time polymorphysm
        p2.walk(3);
        p2.walk();
    }
}
//every class have some properties or behaviours
class person{
    //this is properties
String name;
int age;
    //now this is behaviours
    //methods or functions
    void walk(){
        System.out.println(name+ " is walking");
    }
    void eat(){
        System.out.println(name +" is eating");
    }
    void walk(int steps){
        System.out.println(name+" is walking " +steps +" steps");
    }
}
//this is called compile time polymorphism

