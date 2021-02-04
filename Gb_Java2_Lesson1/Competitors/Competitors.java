package Gb_Java2_Lesson1.Competitors;

public class Competitors {
    private String name;
    private boolean isPassed;
    private int maxRunDistance;
    private int maxSwimDistance;

    public Competitors(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    public boolean isPassed() {
        return isPassed;
    }


    public void setPassed(boolean passed) {
        isPassed = passed;
    }

    public String isTrue(boolean isPassed) {
        if (isPassed) return "Да";
        return "Нет";
    }

    @Override
    public String toString() {
        return "Участники:" +
                " -" + name + '\'' +
                "прошел?- " + isTrue(isPassed) +
                ", Максимум кросса= " + maxRunDistance +
                ", Максимум плавания= " + maxSwimDistance;
    }

}
