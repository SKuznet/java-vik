package lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 0 0 0 0
        int[] array = new int[4];
        System.out.println(array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();

        System.out.println(Arrays.toString(array));
        int[][] array2 = new int[4][2];

        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.deepToString(array2));

        Integer[] array3 = new Integer[3];
        System.out.println(Arrays.toString(array3));

        String[] array4 = new String[3];
        System.out.println(Arrays.toString(array4));

//        byte
        Byte b;
        // short
        Short s;
        // int
        Integer i;
        // float
        Float f;
        // double
        Double d;
//        long
        Long l;
//        boolean
        Boolean bool;
//        char
        Character ch;
        // void
        Void v;

        int val = Integer.parseInt("123");

        System.out.println(val);

    }
}
