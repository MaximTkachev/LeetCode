package solutions.medium;

public class Task74 {

    public static boolean searchMatrix(int[][] matrix, int target) {
        return doSearchMatrix(matrix, target, 0, matrix.length * matrix[0].length - 1);
    }

    public static boolean doSearchMatrix(int[][] matrix, int target, int left, int right) {
        if (left > right)
            return false;

        int index = left + (right - left) / 2;
        int value = matrix[index / matrix[0].length][index % matrix[0].length];

        if (value < target) {
            return doSearchMatrix(matrix, target, index + 1, right);
        }

        if (value > target) {
            return doSearchMatrix(matrix, target, left, index - 1);
        }

        return true;
    }
}
