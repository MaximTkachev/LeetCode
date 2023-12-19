package solutions;

public class Task11 {

    public int maxArea(int[] height) {
        int a = 0;
        int b = height.length - 1;

        int valA;
        int valB;

        int value;
        int max = -1;

        while (a < b) {
            valA = height[a];
            valB = height[b];

            value = Math.min(valA, valB) * (b - a);
            if (value > max) {
                max = value;
            }

            if (valA < valB) {
                a++;
            } else {
                b--;
            }
        }

        return max;
    }
}
