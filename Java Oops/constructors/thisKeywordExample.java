public class thisKeywordExample {
    public static void main(String[] args) {
        person p1=new person();
        p1.age=12;
        p1.name="alishba";
       
//person() this is basically our default constructor
        person p2=new person(31, "wishi");

        System.out.println(p1.name+" "+p1.age);
        System.out.println(p2.name+" "+p2.age);
  //we have not created any object to access this we directly use class name for know how many objects we created in class we use static keyword this is used as class reference
        System.out.println(person.count);
    }
}



class person{
String name;//this is properties
int age;//this is properties

static int count;//lets we know how many constructor(means persons) with static keword

public person(){// this is our default constructor 
    count++;
    System.out.println("creating an object");}

//constructor overload now calling a default constructor from this one constructor by using *this* keyword
public person(int age, String name){
    this();//use for calling default constructor
    this.name =name;//this use to access other parameters
    this.age= age;
}
   
}
