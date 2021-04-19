public class sumPower3 {
    public static boolean sumPower3(int num) {
        return sumPower3(num, 0);
    }

    private static boolean sumPower3(int num, int i) {
        if (num < 0) {
            return false;
        }
        if (num == 0) {
            return true;
        }
        return sumPower3(num - (int) Math.pow(3, i), i + 1) || sumPower3(num, i + 1);
    }
}
