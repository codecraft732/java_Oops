//classes and objects
public class MainClass{
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
        p2.walk();
        p2.walk(3);
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

//remote color white remote have multiple buttons this is remote properties now remote turn on or off ac so it is remote behaviour