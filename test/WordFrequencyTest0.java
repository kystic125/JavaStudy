package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest0 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();

        String[] split = text.split(" ");

        for (String key : split) {
            if (map.get(key) == null) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }

        System.out.println(map);
    }
}
