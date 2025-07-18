package collection.map;

import java.util.HashMap;

public class MapMain3 {
    public static void main(String[] args) {
        HashMap<Object, Object> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 50);
        System.out.println(studentMap);

        // 학생이 없는 경우에만 추가1
        if (!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 90);
        }
        System.out.println(studentMap);

        // 학생이 없는 경우에만 추가2
        studentMap.putIfAbsent("studentA", 100); // studentA가 있으니까 패스
        studentMap.putIfAbsent("studentB", 100); // studentB는 없으므로 추가
        System.out.println(studentMap);
    }
}
