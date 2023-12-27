package solutions.easy;

public class Task27 {

    public int removeElement(int[] nums, int val) {
        int a = 0;
        int b = 0;

        while (b < nums.length) {
            while (b < nums.length && nums[b] == val)
                b++;

            if (b < nums.length)
                nums[a++] = nums[b++];
        }

        return a;
    }
}
