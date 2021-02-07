package Gb_Java2_Lesson2;

public class MySizeArrayException extends RuntimeException {
    public MySizeArrayException(String message) {
        super(message);
    }

    public MySizeArrayException(String message, Throwable cause) {
        super(message, cause);
    }
}
