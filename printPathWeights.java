public class printPathWeights {

    public static void printPathWeights(int [][] m){

        printPathWeights(m,0,0,0);
    }
    private static void printPathWeights(int [][] m, int i, int j,int sum){
        if(i<0 || i>m.length-1 || j<0 || j>m[0].length-1|| m[i][j] == -1){
            return;
        }
        if(i == m.length-1 && j==m[i].length-1){
            System.out.println(sum);
        }
        else {

            int k = m[i][j];
            m[i][j] = -1;
            sum += k;
            printPathWeights(m, i + 1, j, sum);
            printPathWeights(m, i - 1, j, sum);
            printPathWeights(m, i, j + 1, sum);
            printPathWeights(m, i, j - 1, sum);
            m[i][j] = k;
        }
    }
}

