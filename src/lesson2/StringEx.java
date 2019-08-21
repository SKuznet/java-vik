package lesson2;

import java.util.Arrays;

public class StringEx {

    public StringEx() {
    }

    public static void main(String[] args) {
        StringEx ex = new StringEx();
        System.out.println(ex.hashCode());
        String name1 = "";
        String name2 = null;

        System.out.println(name1.isEmpty());
//        System.out.println(name2.isEmpty());

        // 1ob
        String myName = "John";

        // 2ob
        myName = "John SnowW";

        System.out.println(myName.length());
        System.out.println(ex.getSymbol(myName, 0));
        char val = 89;

        System.out.println(myName.codePointAt(0));
        System.out.println(val);
        System.out.println(Arrays.toString(myName.getBytes()));

        System.out.println(ex.isEqual(myName, "john snow"));

        System.out.println(myName.compareTo("John Snow"));
    }

    char getSymbol(String value, int num) {
        if (num >= 0 && (num < value.length())) {
            return value.charAt(num);
        }

        throw new IllegalArgumentException("Params are wrong...");
    }

    private boolean isEqual(String val1, String val2) {
        return val1.equalsIgnoreCase(val2);
    }
}
