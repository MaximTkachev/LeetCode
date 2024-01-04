package solutions.medium;

import java.util.HashMap;
import java.util.Map;

public class Task2870 {

    public static int minOperations(int[] nums) {
        Map<Integer, Integer> store = new HashMap<>();
        for (int i : nums) {
            store.merge(i, 1, Integer::sum);
        }

        int score = 0;
        for (Map.Entry<Integer, Integer> entry : store.entrySet()) {
            if (entry.getValue() == 1) {
                return -1;
            }

            score += entry.getValue() / 3;
            if (entry.getValue() % 3 != 0) {
                score++;
            }
        }

        return score;
    }
}
