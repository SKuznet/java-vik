package lesson4;

public interface CatService {
    // java 8
    default void welcomeToJava8() {
        System.out.println("Now I can have a method realization");
    }

    static void welcomeToJavaStatic8 () {
        System.out.println("asdasasdj");
    }

    public abstract void getSound();

    void sleep();
}
