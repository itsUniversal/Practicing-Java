public class howManyPaths {
    public static int howManyPaths(int[][] mat) {

        return howManyPaths(mat, 0, 0);
    }
    private static int howManyPaths(int[][] mat, int i, int j) {
        if (i < 0 || i > mat.length - 1 || j < 0 || j > mat[0].length - 1 || mat[i][j] == 0) {
            return 0;
        }
        if (i == mat.length - 1 && j == mat[0].length - 1) {
            return 1;
        }

        int k = mat[i][j];
        mat[i][j] = 0;
        int up = howManyPaths(mat, i - k, j);
        int down = howManyPaths(mat, i + k, j);
        int right = howManyPaths(mat, i, j + k);
        int left = howManyPaths(mat, i, j - k);


        mat[i][j] = k;
        return up + down + right + left;
    }
}
