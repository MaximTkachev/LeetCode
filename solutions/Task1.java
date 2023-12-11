package solutions;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> store = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer temp = store.get(target - nums[i]);
            if (temp != null && i != temp) {
                return new int[] {i, temp};
            }

            store.put(nums[i], i);
        }

        return new int[2];
    }
}
