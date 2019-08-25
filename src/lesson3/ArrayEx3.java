package lesson3;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
//        Object[] array = new String[3];
        Object[] array = new Object[3];
        array[0] = "String";
        array[1] = new Integer(3);

        System.out.println(Arrays.toString(array));
    }
}
