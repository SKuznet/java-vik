package lesson5;

import javax.naming.AuthenticationException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex2 {
    public static void main(String[] args) {
        try {
            try {

            } catch (RuntimeException e) {

            }
        } catch (Error e) {

        }
    }

    private void getInfo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(""))) {
            throw new AuthenticationException();
            // java 7
        } catch (FileNotFoundException | AuthenticationException e) {
            System.err.println(e);
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
