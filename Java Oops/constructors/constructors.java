//two types of constructor 
//constructor have multiple uses when we want  to initialize our property we 
//constructors are not functions it use make new new objects 
//we already have default constructors in our programs
public class constructors{
    public static void main(String[] args) {
        person p1=new person();
        p1.age=12;
        p1.name="alishba";
       
//person() this is basically our default constructor
        person p2=new person();
        p2.age=16;
        p2.name="maryam";

        System.out.println(p1.name+" "+p1.age);
        System.out.println(p2.name+" "+p2.age);
        p1.eat();
      
        p2.walk(3);
        p2.walk();
    }
}
//every class have some properties or behaviours
class person{
    //this is properties
String name;
int age;
// this is our default constructor it calls two time in this program we create two objects p1 and p2 
public person(){
    System.out.println("creating an object");

}
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


