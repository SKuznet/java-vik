package lesson3;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        String[] array = new String[]{"Barsik", "Murzik", "Riska"};
        int[] array2 = new int[]{1, 2, 3};

        int[] array3 = new int[3];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = i + 1;
        }

        System.out.println(Arrays.toString(array3));

        System.out.println(array3[1]);

        // recommend
        for (int count : array3) {
            System.out.println(count);
        }
    }
}
