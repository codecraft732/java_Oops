class student{
    int rollno ;
    String name;
    int age;
}
public class defaultaccessmodifier{
    public static void main(String[] args){
        student std1=new student();
       std1.name="ali";
       System.out.println( std1.name);
       std1.age=12;
       System.out.println( std1.age);
       std1.rollno=34;
       System.out.println( std1.rollno);
        }
    }