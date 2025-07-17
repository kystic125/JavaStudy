package collection.set.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNameTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

//        Set<Integer> set = new LinkedHashSet<>();
//        for (Integer s : inputArr) {
//            set.add(s);
//        }

        // 위 코드의 반복문을 제거할 수 있음
//        List<Integer> list = List.of(inputArr);
//        Set<Integer> set = new LinkedHashSet<>(list);
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr)); // 리스트로 만들어서 바로 생성 가능

        // 리스트를 편하게 만드는 방법
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = List.of(1, 2, 3); // 권장 !

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
