package main.java.anonymousinnerclasses;


public class Example {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();

        /**
         * An Anonymous inner class is a class with no name that you use to instantiate only 1 object ever
         * It can extend any existing class or implement an existing interface
         * Anonymous inner classes allow you to create an unnamed subclass of some other class
         * and create one single object of that Anonymous class
         */
        Animal bigFoot = new Animal() {
            public void makeSound() {
                System.out.println("big foot sound");
            }
        };
        bigFoot.makeSound();
    }
}
