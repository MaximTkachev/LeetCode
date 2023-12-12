package solutions;

public class Task26 {

    public int removeDuplicates(int[] nums) {
        int counter = 1;
        int index = 1;
        int pointer = nums[0];

        while (counter < nums.length) {
            if (nums[index] != pointer) {
                pointer = nums[index];
                index++;
            } else {
                move(index - 1, nums);
            }
            counter++;
        }

        return index;
    }

    private static void move(int startIndex, int[] nums) {
        for (int i = startIndex; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
    }
}
