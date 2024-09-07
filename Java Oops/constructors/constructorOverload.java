//2nd type of constructor
public class constructorOverload {
    public static void main(String[] args) {
        person p1=new person();
        p1.age=12;
        p1.name="alishba";
       
//person() this is basically our default constructor
        person p2=new person(31, "wishi");

        System.out.println(p1.name+" "+p1.age);
        System.out.println(p2.name+" "+p2.age);
  //we have not created any object to access this we directly use class name 
        //for know how many objects we created in class we use static keyword this is used as class reference
        System.out.println(person.count);
    }
}
//every class have some properties or behaviours
class person{
    //this is properties
String name;
int age;//lets we know how many constructor(means persons) we have created
//static means its class property not object 
static int count;// this is our default constructor it calls two time in this program we create two objects p1 and p2 
public person(){
    count++;
    System.out.println("creating an object");}

//constructor overload 
//now i want to call default constructor from this one
public person(int newAge, String newName){
    //this();
    name =newName;
    age= newAge;}}



