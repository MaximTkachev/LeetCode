package solutions.medium;

public class Task59 {

    public static int[][] generateMatrix(int n) {
        int startX = 0;
        int startY = 0;
        int x;
        int y;
        int counter = 1;
        int[][] matrix = new int[n][n];
        for (int i = 0; i <= Math.ceil(n / 2.0); i++) {
            for (y = startY; y < n - i; y++)
                matrix[startX][y] = counter++;
            y--;
            for (x = startX + 1; x < n - i; x++)
                matrix[x][y] = counter++;
            x--; y--;
            for (; y >= i; y--)
                matrix[x][y] = counter++;
            x--; y++;
            for (; x > i; x--)
                matrix[x][y] = counter++;
            startX++; startY++;
        }

        return matrix;
    }
}
