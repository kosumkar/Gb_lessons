package Gb_Java2_Lesson1.Competitors;

public class Team {
    private String name;
    private Competitors[] competitors;

    public Team(String name, Competitors... competitors) {
        this.name = name;
        this.competitors = competitors;
    }

    public Competitors[] getCompetitors() {
        return competitors;
    }

    public void showAll() {
        System.out.println("Полная информация");
        System.out.println("Название команды: " + name);
        for (Competitors competitor : competitors) {
            System.out.println(competitor);

        }
    }

    public void showPassed() {
        System.out.println("Информация о прошедших");
        System.out.println("Команда: " + name);
        for (Competitors competitor : competitors) {
            if (competitor.isPassed()) {
                System.out.println(competitor);
            }
        }
    }
}
