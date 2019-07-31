package practice_7.classes;

import practice_7.interfaces.Animal;

public class Dog implements Animal {
    @Override
    public void move() {
        System.out.println("Be aware of Dog....Dog is moving.");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating....");
    }

    public void bark(){
        System.out.println("Dog is barking...");
    }
}
