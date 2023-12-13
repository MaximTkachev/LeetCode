package solutions;

public class Task1582 {

    public int numSpecial(int[][] mat) {
        int[] rows = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != 0) {
                    rows[i]++;
                }
            }
        }

        int[] columns = new int[mat[0].length];
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[j][i] != 0) {
                    columns[i]++;
                }
            }
        }

        int counter = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1 && rows[i] == 1 && columns[j] == 1) {
                    counter++;
                }
            }
        }

        return counter;
    }
}
