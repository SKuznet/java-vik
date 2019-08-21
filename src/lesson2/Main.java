package lesson2;

public class Main {
    byte a = 0;
    short s;

    String string = null;

    public static void main(String[] args) {
        String name1 = "";
        String name2 = null;

        System.out.println(name1.isEmpty());
        System.out.println("Hello world!");

        // когда мы создаем строку с "" - у нас строка добавляется в пул литералов
        String example = "barsik";
        String example2 = "barsik";

        System.out.println(example.charAt(1));

        System.out.println(example.hashCode());

        // коллизия - одинаковый хешкод у двух разных объектов
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        String example3 = new String("barsik");

        System.out.println(example == example2);
        System.out.println(example.equals(example3));

        int code1 = 5;
        int code2 = 5;

        System.out.println(code1 == code2);

    }
}
