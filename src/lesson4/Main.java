package lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static {

    }

    {

    }

    public static void main(String[] args) {

        // before 7 java
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        try {
//            String val = reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


        // try-with-resources since 7 java
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String val = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
