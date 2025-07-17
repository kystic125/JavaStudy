package collection.set.test;

import java.util.*;

public class UniqueNameTest3 {
    public static void main(String[] args) {
//        Set<Integer> set = new TreeSet<>(List.of(inputArr));
//        Integer[] inputArr = {30, 20, 20, 10, 10};
        // inputArr 없이 바로 넣어도 상관 없음 // List<Integer> list = List.of(30, 20, 20, 10, 10)과 같음
        Set<Integer> set = new TreeSet<>(List.of(30, 20, 20, 10, 10));

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
