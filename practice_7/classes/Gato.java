package practice_7.classes;

import practice_7.interfaces.Animal;

public class Gato implements Animal {

    @Override
    public void move() {
        System.out.println("Gato is moving");
    }

    @Override
    public void eat() {
        System.out.println("Gato is Eating...");
    }
}
