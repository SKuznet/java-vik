package lesson5;

import java.io.IOException;

public class Barsik extends Cat {
    public Barsik() throws IOException {
        i = 10;
    }

    @Override
    public void getInfo() throws IOException {
        super.getInfo();
    }

    public static void main(String[] args) throws IOException {
        Cat cat = new Barsik();
        System.out.println(cat.i);
        Barsik barsik = new Barsik();
        System.out.println(barsik.i);
    }
}
