package lesson2;

public class StringEx3 {
    public static void main(String[] args) {
        String name = "Barsik";

        char[] array = name.toCharArray();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }

        String name2 = "Ba" + "rs" + "ik";
        // потокобезопасный
        StringBuffer buffer;
        // быстрее, но не потокобезопасный
        StringBuilder builder;

        System.out.println();
//        StringBuilder builder1 = new StringBuilder("Barsik");
        StringBuilder builder1 = new StringBuilder();
        builder1.append("Barsik");

        System.out.println(builder1.reverse());

    }
}
