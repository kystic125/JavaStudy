package lang.wrapper.test;

import java.util.Arrays;
import java.util.Random;

public class MyLotto {
    public static void main(String[] args) {
        int[] array = new int[6];
        Random random = new Random();
        int cnt = 0;

        while (cnt < 6) {
            boolean isUnique = true;
            int num = random.nextInt(45)+1;
            for (int i = 0; i < cnt; i++) {
                if (array[i] == num) {
                    isUnique = false;
                }
            }
            if (isUnique) {
                array[cnt] = num;
                cnt++;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
