package Gb_CatAndFood;

public class Main {


    public static void main(String[] args) {
        Plate plate = new Plate();
        Cat[] cats = {
                new Cat(3, "Musya"),
                new Cat(5, "Sarb"),
                new Cat(23, "Jora"),
        };

        for (Cat i : cats) {
            i.eat(plate);
            System.out.println(i);

            System.out.println(plate);

        }

        System.out.println("...Идет наполнение...Бип бип...");
        plate.addFood(8);
        System.out.println(plate);
    }
}

