public class longestPath {
    public static int longestPath(int mat[][], int x, int y) {
        return longestPath(mat, 0, 0, x, y);
    }
    private static int longestPath(int mat[][], int i, int j, int x, int y) {
        if (i < 0 || i > mat.length - 1 || j < 0 || j > mat[0].length - 1 || mat[i][j] == 0) {
            return Integer.MIN_VALUE;
        }
        if (i == x && j == y) {
            return 0;
        }

        int val = mat[i][j];
        mat[i][j] = 0;
        int up = 1 + longestPath(mat, i - 1, j, x, y);
        int down = 1 + longestPath(mat, i + 1, j, x, y);
        int right = 1 + longestPath(mat, i, j + 1, x, y);
        int left = 1 + longestPath(mat, i, j - 1, x, y);


        mat[i][j] = val;
        return Math.max(Math.max(up, down), Math.max(right, left));
    }
}
