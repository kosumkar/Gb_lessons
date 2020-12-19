package geekbrains_lessons_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Все виды пройденных типов данных для Второго задания из практики
        int number = 10;
        double d = 0.2;
        float f = 0.3f;
        boolean b = true;
        char c = 'C';
        String str = "Hello world";

        // Здесь все вызовы методов от 3 до 8 включительно

        System.out.println(" Решение для 3 задачи по практике : " + ThirdPracticExer());

        boolean IsInRange = ForthPracticExer(1, 15);
        System.out.println(" Решение для 4 задачи по практике : " + IsInRange);

        FifthPracticalExer(0);

        boolean IsItPositive = SixPracticExer(3);
        System.out.println(" Решение для 6 задачи по практике : " + IsItPositive);

        SeventhPracticExer("NullPointerException");


        //Дополнительное задание
        StarPracticExer();


    }

    private static float ThirdPracticExer() {

        // Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат

        float a = 0.1f;
        float b = 1.0f;
        float c = 3.2f;
        float d = -1.2f;
        float v = a * (b + (c / d));

        return v;

    }

    private static boolean ForthPracticExer(int SumFi, int SumSe) {

        int i = SumFi + SumSe;
        if (i >= 10 && i <= 20) return true;
        return false;

    }

    private static void FifthPracticalExer(int input) {

        System.out.print(" Решение для 5 задачи по практике : ");
        if (input >= 0) {
            System.out.println("Число Положительное");
        } else {
            System.out.println("Число Отрицательное");
        }

    }

    private static boolean SixPracticExer(int AboveOrNot) {

        if (AboveOrNot >= 0) return true;
        return false;

    }

    private static void SeventhPracticExer(String HelloYou) {

        System.out.println(" Решение для 7 задачи по практике : " + "Привет, " + HelloYou + ".");
    }

    private static void StarPracticExer() {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Решение для 8 задачи по практике : ");
        System.out.println("Введи мне, молодец, цифру года, а я тебе погадаю, високосный он али нет.");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            System.out.println("Год ваш високосный. Юлий Цезарь одобрямс.");

        } else {
            System.out.println("Год ваш не кошерный, извиняй.");
        }

    }
}
