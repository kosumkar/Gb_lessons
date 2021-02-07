package Gb_Java2_Lesson2;

public class ArrayIntSum {


    public int calc(String[][] values) {
        checkSizeCondition(values);

        for (String[] value : values) {
            checkSizeCondition(value);
        }

        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                try {
                    sum += Integer.parseInt(values[i][j]);
                } catch (NumberFormatException e) {

                    System.out.println("Sum operation is not complete: " + sum);

                    throw new MyArrayDataException(
                            String.format("Array[%s][%s] contains non-parsable value: %s", i, j, values[i][j]),
                            e
                    );

                }
            }
        }


        return sum;
    }

    private void checkSizeCondition(String[][] values) {
        if (values.length != 4) {
            throw new MySizeArrayException("Array should be 4 to 4 -size");
        }
    }

    private void checkSizeCondition(String[] values) {
        if (values.length != 4) {
            throw new MySizeArrayException("Array should be 4-size");
        }
    }
}
