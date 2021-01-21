package Gb_CatAndFood;

public class Plate {
    private final int capacity;
    private int fillness;

    public Plate() {
        this(50, 30 );
    }

    public Plate(int capacity, int fillness) {
        this.capacity = capacity;
        this.fillness = fillness;
    }

    public boolean decreaseFood(int requestFillness) {
        if (requestFillness > fillness) {
            return false;
        }
        fillness -= requestFillness;
        return true;
    }

    public void addFood(int fillness) {
        if (fillness <= capacity) {
            int tem = this.fillness + fillness;

            this.fillness = tem <= capacity ? tem : capacity;
        }
    }

    @Override
    public String toString() {
        return "Тарелка(" +
                "Загруженность: " + fillness +
                "/" + capacity  +
                ')';
    }
}

