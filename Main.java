package geekbrains_lessons_3;

import java.util.Scanner;

public class Main {
   private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("У вас три попытки ");

        playLevel(9);
        scanner.close();
    }


    private static void playLevel(int range) {


        do {
            int number = (int) (Math.random() * range);
            int n = 0;
            while (n != 3) {
                System.out.println("Угадайте число от 0 до 9: ");
                int input_number = scanner.nextInt();
                if (input_number == number) {
                    System.out.println("Угадал");
                    break;
                } else if (input_number > number) {
                    System.out.println("Введенное число больше загаданного");
                    n++;
                } else {
                    System.out.println("Введеное число меньше загаданного");
                    n++;

                }


            }
            System.out.println("Загаданным числом была: " + number);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет ");
            int RepGame = scanner.nextInt();
            if(RepGame != 0 && RepGame != 1){
                System.out.println("Ваше число неуместно. Завершение игры. ");
                break;
            } else if ( RepGame == 0){
                System.out.println("Спасибо за участие. ");
                break;
            }

        } while (true);

    }
}
