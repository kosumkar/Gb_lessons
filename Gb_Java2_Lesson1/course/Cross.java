package Gb_Java2_Lesson1.course;

import Gb_Java2_Lesson1.Competitors.Competitors;

public class Cross extends Obstacles {
    private final int distance = 200;

    @Override
    protected void doIt(Competitors competitors) {
        competitors.setPassed(competitors.getMaxRunDistance() >= distance);
    }
}