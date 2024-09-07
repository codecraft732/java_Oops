public class inheritance { 
    //in java u are created multiple classes all their parents is object
     // Corrected class name to follow Java naming conventions
    // Define the parent class first
    void out(){
        System.out.println("get out");
    }
    class Parent {
        String name;
        int age;

        // Parameterized constructor
        public Parent(int age, String name) {
            System.out.println("My name is "+ name +" my age is " + age);
            this.name = name;
            this.age = age;
        }

        // Methods
        void walk() {
            System.out.println("It is walking");
        }

        void eat() {
            System.out.println("It is eating");
        }
    }

    // Define the child class extending the parent class
    class Child extends Parent {
        // The child class must call the parent's constructor
        public Child(int age, String name) {
            super(age, name); // Calling the parent class constructor
        }
    }

    // Main method to test the classes
    public static void main(String[] args){
        inheritance ch = new inheritance();
        ch.out();
        Child cH = ch.new Child(10, "John");
        cH.walk();
        cH.eat();
    }
}
