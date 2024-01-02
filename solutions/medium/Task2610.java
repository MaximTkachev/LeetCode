package solutions.medium;

import java.util.ArrayList;
import java.util.List;

public class Task2610 {

    public static List<List<Integer>> findMatrix(int[] nums) {
        int[] store = new int[nums.length];
        ArrayList<List<Integer>> result = new ArrayList<>();

        for (int i : nums) {
            if (result.size() <= store[i - 1]) {
                result.add(new ArrayList<>());
            }
            result.get(store[i - 1]).add(i);

            store[i - 1]++;
        }

        return result;
    }
}
