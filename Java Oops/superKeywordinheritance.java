
//super keyword example 3 types of uses in super keyword
//variable method or constructor
//that's how we use super
class Animal{
String color= "red";
public void run(){
System.out.println("animal is running");
}
 Animal(){
System.out.println(" creating parent obj");
}

}
class Dog extends Animal{
    String color= "White";
    public void run(){
        System.out.println("Dog is running");
    }
   Dog(){
    super();
    System.out.println("creating child object");
    }
    public void display(){
        System.out.println(color);
        System.out.println(super.color);
        super.run();
        run();
        
    }
}
public class superKeywordinheritance {
    public static void main(String[] args){
        Dog obj= new Dog();
       obj.display();
       
    }
}







