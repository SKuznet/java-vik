package lesson5;

public class Ex3 {
    public static void main(String[] args) {
        Ex3 ex = new Ex3();
        System.out.println(ex.getRes());
    }

    private int getRes() {
        int i = 0;
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            i = 5;
            return i;
        } finally {
            i = 10;
            return i;
        }
    }
}
