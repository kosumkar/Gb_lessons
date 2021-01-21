package Gb_CatAndFood;

public class Cat {
    private boolean isSatiety;
    private String petName;
    private int stomachSize;

    public Cat(int stomachSize, String petName) {
        this.stomachSize = stomachSize;
        this.petName = petName;

    }


    public boolean isSatiety() {
        return isSatiety;
    }

    public void eat(Plate plate) {
        isSatiety = plate.decreaseFood(stomachSize);
    }

    @Override
    public String toString() {
        return "Кошка (" + petName +
                ") сыта? = " + isSatiety;
    }
}
