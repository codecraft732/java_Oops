//example of single inheritance
public class singleInheritance {
    public static void main(String[] args){
        Bonus obj=new Bonus();
        obj.salary();
        obj.bonus();
    }
}

   
    class Employee{
    int salary=7000;
    int bonus= 2000;
        void salary(){
            System.out.println("Salary is "+ salary);
        } }
    class Bonus extends Employee{
            void bonus(){
            System.out.println("Bonus is "+ bonus);}
        }  


