package practice_7;

import practice_7.classes.Dog;
import practice_7.classes.Gato;
import practice_7.interfaces.Animal;

public class Zoo {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        Gato gato = new Gato();

        animal = gato;
        animal.move();
    }

}
