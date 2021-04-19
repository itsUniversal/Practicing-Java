public class minPath {
    public static int minPath(char[][] minChess, int i, int j) {
        return minPath(minChess, 0, 0, 0);
    }

    private static int minPath(char[][] minChess, int i, int j, int count) {
        if (i < 0 || i > minChess.length - 1 || j < 0 || j > minChess[0].length - 1 || minChess[i][j] == '1') {
            return Integer.MAX_VALUE;
        }
        if (minChess[i][j] == 'K')
            return count;

        char val = minChess[i][j];
        minChess[i][j] = '1';

        int move1 = minPath(minChess, i + 2, j + 1, count + 1);
        int move2 = minPath(minChess, i + 2, j - 1, count + 1);
        int move3 = minPath(minChess, i - 2, j + 1, count + 1);
        int move4 = minPath(minChess, i - 2, j - 1, count + 1);
        int move5 = minPath(minChess, i + 1, j + 2, count + 1);
        int move6 = minPath(minChess, i + 1, j - 2, count + 1);
        int move7 = minPath(minChess, i - 1, j + 2, count + 1);
        int move8 = minPath(minChess, i - 1, j - 2, count + 1);

        minChess[i][j] = val;
        int opt1 = Math.min(Math.min(move1, move2), Math.min(move3, move4));
        int opt2 = Math.min(Math.min(move5, move6), Math.min(move7, move8));
        return Math.min(opt1, opt2);

    }
}
