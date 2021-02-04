package Gb_Java2_Lesson1.course;

import Gb_Java2_Lesson1.Competitors.Competitors;
import Gb_Java2_Lesson1.Competitors.Team;

public abstract class Obstacles implements Course {
    @Override
    public void doIt(Team team) {
        for (int i = 0; i < team.getCompetitors().length; i++) {
            doIt(team.getCompetitors()[i]);
        }
    }

    protected abstract void doIt(Competitors competitors);
}

