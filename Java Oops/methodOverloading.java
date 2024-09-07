//method overloading same method name different arguments change type order sequence

public class methodOverloading {
    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum(int a , int b, int c){
        return a+b+c;
    }
    public static String sum(String a , String b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println(sum(2, 4));
        System.out.println(sum(3,1,2));
        System.out.println(sum("ali","ahmad"));
    }}
