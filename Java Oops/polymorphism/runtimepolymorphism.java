// Base class
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class 1
class Dog extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class 2
class Cat extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class to test runtime polymorphism
public class runtimepolymorphism {
    public static void main(String[] args) {
        // Creating an object of the parent class and assigning child objects to it
        Animal myAnimal; // Reference of type Animal

        // Dog object
        myAnimal = new Dog();
        myAnimal.sound(); // Outputs: Dog barks

        // Cat object
        myAnimal = new Cat();
      myAnimal.sound(); // Outputs: Cat meows

    

    }
}

/*Class Animal: This is the base class with a method sound() that can be overridden.

Class Dog and Cat: These are subclasses of Animal that override the sound() method to provide specific implementations.

Polymorphism in Action: In the main method:

The Animal reference myAnimal is used to refer to objects of the Dog and Cat classes.
When myAnimal.sound() is called, the JVM determines at runtime which class's sound() method to execute based on the actual object type (Dog or Cat), not the reference type (Animal). */