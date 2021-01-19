package Gb_units;

import Gb_units.animals.Animal;
import Gb_units.animals.Cat;
import Gb_units.animals.Dog;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Барсик"),
                new Cat("Елена"),
                new Dog("Гавганыч"),
                new Cat("Черныш")
        };


        for (int i = 0; i < animals.length; i++) {
            animals[i].run(150);
            animals[i].swim(150);
        }

    }

}

