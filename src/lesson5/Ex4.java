package lesson5;

public class Ex4 {
    public static void main(String[] args) {
        try {
            System.out.println("I am going to generate exception");
            throw new RuntimeException();
        } catch (RuntimeException e) {

        }

        System.out.println("I am there");
    }
}
