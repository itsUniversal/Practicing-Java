public class countRopes {
    public static int countRopes(int[][] mat) {
        return countRopes(mat, 0);
    }
    private static int countRopes(int[][] mat, int j) {
        if (j == mat[0].length) {
            return 0;
        }
        int a = 0, b = 0, c = 0;
        a = countRopes(mat, 1, j - 1, mat[0][j]);
        b = countRopes(mat, 1, j + 1, mat[0][j]);
        c = countRopes(mat, 1, j, mat[0][j]);
        return a + b + c + countRopes(mat, j + 1);
    }
    private static int countRopes(int[][] mat, int i, int j, int ref) {
        if (j < 0 || j == mat[0].length || mat[i][j] >=ref){
            return 0;
        }
        if (i == mat.length - 1) {
            return 1;
        }
        int a=0,b=0,c=0;
        a = countRopes(mat, i + 1, j - 1, mat[i][j]);
        b = countRopes(mat, i + 1, j + 1, mat[i][j]);
        c = countRopes(mat, i + 1, j, mat[i][j]);
        return a + b + c;
    }
}
