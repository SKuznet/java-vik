package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
//        try {
//            getInfo("jack");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    // null
    private static void getInfo(String info) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            System.out.println(info.toUpperCase() + reader.readLine());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        // try with resources

//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//           reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println(reader.readLine());
        }

    }
}
