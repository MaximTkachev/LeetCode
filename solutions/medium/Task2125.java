package solutions.medium;

import java.util.HashMap;

public class Task2125 {

    public static void main(String[] args) {
        String[] a = {"011001", "000000", "010100", "001000"};
        String[] b = {"000","111","000"};
        System.out.println(numberOfBeams(a));
    }

    public static int numberOfBeams(String[] bank) {
        int[] store = new int[bank.length];
        int temp;
        for (int i = 0; i < bank.length; i++) {
            temp = 0;
            for (byte b : bank[i].getBytes()) {
                if (b == '1') temp++;
            }

            store[i] = temp;
        }

        int left = 0;
        int right = 1;
        int counter = 0;

        while (right < bank.length) {
            while (right < bank.length && store[right] == 0)
                right++;

            if (right == bank.length) return counter;
            counter += store[left] * store[right];

            left = right;
            right++;
        }

        return counter;
    }
}
