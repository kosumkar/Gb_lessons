package Gb_Java2_Lesson1.course;

import Gb_Java2_Lesson1.Competitors.Competitors;

public class Pool extends Obstacles {
    private final int distance = 50;

    @Override
    protected void doIt(Competitors competitors) {
        competitors.setPassed(competitors.getMaxSwimDistance() >= distance);
    }
}
