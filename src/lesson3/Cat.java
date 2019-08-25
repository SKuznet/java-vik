package lesson3;

import java.util.Arrays;

public class Cat extends Animal {
    void getChildInfo() {
        System.out.println("I am cat!");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.getChildInfo();

        // recommend
        Animal catAn = new Cat();
        catAn.getChildInfo();

        Animal animal = new Animal();
        animal.getChildInfo();

        Cat[] cats = new Cat[2];
        Animal[] catA = new Animal[2];
        Object[] arr = catA;

        catA = cats;

        cats = (Cat[]) catA;

        System.out.println(Arrays.toString(cats));

        short a = 5;
        short b = 5;

        short res = (short) (a + b);
    }
}
