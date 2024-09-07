class student{
    private int rollno ;
    private String name;
    private int age;
    student(int rollno, String name, int age){
       System.out.println("creating obj");
       this.rollno=rollno;
       this.name=name;
       this.age=age;
    }
    void details(){
        System.out.println(rollno);
        System.out.println(name);
        System.out.println(age);
    }
}
public class privateaccessmodifier{
    public static void main(String[] args){
        student std1=new student(12, "ali", 23);
      std1.details();
        }
    }

//it give error its not access in main because its private 
//so if we want to access private in main use constructor otherwise we cannot access it anywhere not even in subclass
/*class student{
    private int rollno ;
    private String name;
    private int age;
}
public class privateaccessmodifier{
    public static void main(String[] args){
        student std1=new student();
       std1.name="ali";
       System.out.println( std1.name);
       std1.age=12;
       System.out.println( std1.age);
       std1.rollno=34;
       System.out.println( std1.rollno);
        }
    }*/