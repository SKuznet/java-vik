package lesson4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionEx2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Snegok");
        list.add("Snegok");
        list.add("Snegok");
        list.add("Barsik");
        list.add("Barsik");
        list.add("Barsik");

        // NEVER USE SOMETHING LIKE THIS FOR removing element from collection
//        for (String val : list) {
//            if (val.equals("Snegok")) {
//                list.remove(val);
//            }
//        }

        Iterator iterator = list.iterator();
        CatService catService = new CatService() {

            public void getSound() {

            }

            @Override
            public void sleep() {

            }
        };

        while (iterator.hasNext()) {
            if (iterator.next().equals("Snegok")) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
