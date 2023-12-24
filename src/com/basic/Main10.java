package com.basic;

class Animal {
    void makeSound() {
        System.out.println("Generic Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Main10 {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Using polymorphism

        // Calls the overridden makeSound method of the Dog class
        myDog.makeSound(); // Output: Bark
    }
}
