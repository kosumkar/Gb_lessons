package Gb_Java2_Lesson1;

import Gb_Java2_Lesson1.Competitors.Competitors;
import Gb_Java2_Lesson1.Competitors.Team;
import Gb_Java2_Lesson1.course.Course;
import Gb_Java2_Lesson1.course.Cross;
import Gb_Java2_Lesson1.course.Pool;


public class Main {

    public static void main(String[] args) {

        Course[] courses = {new Cross(), new Pool()};
        Team team = new Team(
                "Гармония",
                new Competitors("Первый", 1, 99),
                new Competitors("Второй", 66, 66),
                new Competitors("Третий", 333, 22),
                new Competitors("Четвертый", 500, 0)
        );

        for (Course cours : courses) {
            System.out.println();
            System.out.println("Препядствие: " + cours.getClass().getSimpleName());
            cours.doIt(team);
            team.showAll();
            team.showPassed();
        }

    }


}

