package Gb_units.animals;

public class Dog extends Animal {

    private String petName;

    public Dog(String petName) {
        super(500, 10);
        this.petName = petName;
    }


    @Override
    public void swim(int distance) {
        if (distance > swimDistance) {
            System.out.printf("Для собаки %s проплыть %s метров слишком много. Макс: %s%n", petName, distance, swimDistance);
        } else {
            System.out.printf("Собака %s проплыла %s метров.", petName, +distance);
            System.out.println(" ");
        }
    }

    @Override
    public void run(int distance) {
        if (distance > runDistance) {
            System.out.printf("Для собаки %s пробежать %s метров слишком много. Макс: %s", petName, distance, runDistance);
            System.out.println(" ");
        } else {
            System.out.printf("Собака %s пробежала %s метров.", petName, distance);
            System.out.println(" ");
        }
    }
}
