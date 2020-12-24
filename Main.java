package geekbrains_lessons_2;

public class Main {

    public static void main(String[] args) {

        FirstArray();
        SecondArray();
        ThirdArray();
        ForthArray();
        FifthArray();

        int[] SixthDigits = {2, 2, 2, 1, 2, 2, 10, 1};
        boolean Check = SixthArray(SixthDigits);
        System.out.println("Есть ли равенство между этими числами? Ответ: " + Check);

        int[] SeventhDigits = {1, 2, 3, 4, 5};
        SeventhArray(SeventhDigits, -2);


    }


    private static void FirstArray() {

        int[] digits = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("   1.Первое задание:");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + "  ");
        }
        System.out.println(" ");
        System.out.println("После замены");
        for (int j = 0; j < digits.length; j++) {
            if (digits[j] == 1) {
                digits[j] = 0;
            } else {
                digits[j] = 1;
            }
            System.out.print(digits[j] + "  ");
        }

    }

    private static void SecondArray() {

        System.out.println("");
        System.out.println("   2.Второе задание :");
        int[] digits = new int[8];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = i * 3;
            System.out.print(digits[i] + "  ");
        }

    }

    private static void ThirdArray() {

        System.out.println("");
        System.out.println("   3.Третье задание :");
        int[] digits = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < 6) {
                digits[i] *= 2;
            }
            System.out.print(digits[i] + "  ");

        }
    }

    private static void ForthArray() {

        System.out.println("");
        System.out.println("   4.Четвертое задание :");
        int[][] digits = new int[5][5];
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits[i].length; j++) {
                if (i == j) {
                    digits[i][j] = 1;

                }
                System.out.print(digits[i][j] + "  ");
            }
            System.out.println("");

        }
    }

    private static void FifthArray() {
        System.out.println("");
        System.out.println("   5.Пятое задание :");

        int[] digits = {3, 2, 1, 8, 5, 4};
        System.out.println("Первый элемент массива: " + digits[0]);
        System.out.println("Последний элемент массива: " + digits[digits.length - 1]);

        //Сортировка чисел внутри массива по порядку возрастания

        int[] SwapArray = digits;
        /*Я знаю, что это просто получился массив со ссылками
         *При изменении которого изменяется и digits[].
         * Мог реализовать через цикл for присвоение ячеек от корневого массива,
         * Но решил, что в задачу это не входит и что и так сойдет.
         *
         *P.s. Не подскажите каким инструментом можно сразу копировать массив?
         */
        for (int i = 0; i < SwapArray.length; i++) {
            if (i < SwapArray.length - 1 && SwapArray[i] > SwapArray[i + 1]) {
                int tempVar = SwapArray[i];
                SwapArray[i] = SwapArray[i + 1];
                SwapArray[i + 1] = tempVar;
                if (i == 0) i++;
                i -= 2;
            }
        }
        System.out.println("Минимальным значением в массиве является: " + SwapArray[0]);
        System.out.println("Максимальным значением в массиве является: " + SwapArray[SwapArray.length - 1]);

    }

    private static boolean SixthArray(int[] Balance) {
        System.out.println("");
        System.out.println("   6.Шестое задание :");
        int Total = 0;
        int EqualSide = 0;
        boolean Equal = false;
        for (int i = 0; i < Balance.length; i++) {
            Total += Balance[i];
        }
        for (int i = 0; i < Balance.length; i++) {
            ;
            EqualSide += Balance[i];
            if (EqualSide == Total / 2) Equal = true;
        }

        return Equal;
    }

    private static void SeventhArray(int[] Seven, int Move) {
        System.out.println("");
        System.out.println("   7.Седьмое задание :");
        System.out.println("Первоначальный массив: ");

        for (int i = 0; i < Seven.length; i++) {
            System.out.print(Seven[i] + "  ");
        }

        int n = 0;
        int tempV;
        while (n != Move) {

            if (Move < 0) {
                tempV = Seven[0];
                for (int i = 0; i < Seven.length; i++) {
                    if (i < Seven.length - 1) {
                        Seven[i] = Seven[i + 1];
                    } else {
                        Seven[i] = tempV;
                    }


                }
                n--;
            } else {
                tempV = Seven[Seven.length - 1];
                for (int i = Seven.length; i > 0; i--) {
                    if (i > 1) {
                        Seven[i - 1] = Seven[i - 2];
                    } else {
                        Seven[i - 1] = tempV;
                    }


                }
                n++;
            }

        }

        System.out.println(" ");
        System.out.println("Сдвигнутый массив:  ");

        for (int i = 0; i < Seven.length; i++) {
            System.out.print(Seven[i] + "  ");
        }


    }


}






