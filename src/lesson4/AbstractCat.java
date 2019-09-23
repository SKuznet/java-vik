package lesson4;

public abstract class AbstractCat {
    abstract void getInfo();

    void getSound() {
        System.out.println("Mur");
    }

    public static void main(String[] args) {

        Cat cat3 = new Cat();
    }
}
