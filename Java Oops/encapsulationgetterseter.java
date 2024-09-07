class Student{
    private int rollno;
    private int age;
    private String name;

    public void set_details(String name, int age, int rollno){
        this.name=name;
        this.age=age;
        this.rollno=rollno;

    }
   

    public String  getName(){
       return name;
    }
    public int getAge(){
        return age;
    }
    public int getRoll(){
        return rollno;
    }

    
}
public class encapsulationgetterseter {
    public static void main(String[] args){
        Student obj=new Student();
      obj.set_details("ali",12,34);
        obj.getName();
        obj.getAge();
        obj.getRoll();
        System.out.println("name"+obj.getName());
        System.out.println("age"+obj.getAge());
        System.out.println("rollno"+obj.getRoll());
    }
}

