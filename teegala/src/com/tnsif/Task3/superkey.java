package com.tnsif.Task3;

public class superkey {

    // Parent class
    static class Animal {
        void sound() {
            System.out.println("Animals make sounds.");
        }
    }

    // Child class
    static class Dog extends Animal {
        @Override
        void sound() {
            super.sound(); // calling immediate parent class method
            System.out.println("Dog barks.");
        }
    }

    // Main class
    public static class SuperKeywordDemo {
        public static void main(String[] args) {
            Dog d = new Dog();
            d.sound();
        }
    }
}
