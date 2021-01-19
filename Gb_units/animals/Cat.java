package Gb_units.animals;

import java.awt.event.PaintEvent;

public class Cat extends Animal {

    private String petName;

    public Cat(String petName) {
        super(200, 0);
        this.petName = petName;

    }

    @Override
    public void swim(int distance) {
        System.out.printf("Кошка %s плавать не могет!", petName);
        System.out.println(" ");
    }

    @Override
    public void run(int distance) {
        if (distance > runDistance) {
            System.out.println(" ");
            System.out.printf(
                    "Для кошки %s пробежать %s метров слишком много. Макс: %s%n", petName, distance, runDistance);
            System.out.println(" ");
        } else {
            System.out.printf("Кошка %s пробежала %s метров. ", petName, distance);
            System.out.println(" ");
        }
    }
}

