package lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEx2 {
    public static void main(String[] args)  {
        String name = "Barsik";
        String name2 = new String("Barsik").intern();

        System.out.println(name == name2);

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // checked exception || unchecked exception
//        try {
//            String result = reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String result = reader.readLine();
        StringEx2 ex2 = new StringEx2();
        System.out.println(ex2.getOtvets().toUpperCase());
    }

    private String getOtvets(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String result = null;
        try {
            result = reader.readLine();
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }


}
