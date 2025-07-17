package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {

        run(new HashSet<>()); // O(1)
        run(new LinkedHashSet<>()); // O(1) // HashSet보단 좀 더 느림
        run(new TreeSet<>()); // O(logN)
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) { // hasNext: 다음 값이 있으면 true, 없으면 false
            System.out.print(iterator.next() + " "); // next: 다음 데이터를 반환
        }
        System.out.println();
    }
}
