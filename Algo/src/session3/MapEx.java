package session3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "111");
        map.put(0, "333");
        map.put(1, "222");
        map.put(2, "3333");
        System.out.println("map = " + map);

        final String twoEl = map.get(2);
        System.out.println("twoEl = " + twoEl);

        final boolean isPresentKey = map.containsKey(5);
        System.out.println("isPresentKey = " + isPresentKey);

        final boolean isPresentValue = map.containsValue(5);
        System.out.println("isPresentValue = " + isPresentValue);

        map.remove(0);
        System.out.println("map after remove = " + map);


        // Iterator - override of keys
        final Set<Integer> keys = map.keySet();
        System.out.println("keys = " + keys);
        for (Integer element : keys) {
            System.out.println("key[" + element + "]");
        }
        System.out.println();


        // Iterator, EntrySet - override of keys AND values
        final Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("entries = " + entries);
        
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("element: " + entry);
        }

    }
}