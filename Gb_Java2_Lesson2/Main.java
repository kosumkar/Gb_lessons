package Gb_Java2_Lesson2;

public class Main {

    public static void main(String[] args) {

        try {
            String[][] values = {
                    {"8", "7", "5", "5"},
                    {"13", "-12", "-20", "30"},
                    {"41", "3", "0", "-1"},
                    {"11", "12", "52", "43"}
            };


            System.out.printf("Sum of all integers in Array is: %d%n",
                    new ArrayIntSum().calc(values)
            );


        } catch (MySizeArrayException | MyArrayDataException e) {
            throw new RuntimeException("Something went wrong during calculation", e);
        }
    }
}
