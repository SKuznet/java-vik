package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Ex ex = new Ex();
            ex.getInfo(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // throws - перекладывание ответственности
    // throw - выкидывание исключения
    private void getInfo(String val) {
        if(!val.equalsIgnoreCase("Barsik")) {
            System.out.println("Feed barsik");
        }

        throw new IllegalArgumentException(val + " doesn't Barsik");
    }
}
