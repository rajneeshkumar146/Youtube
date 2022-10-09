import java.util.Arrays;

public class file {

    public static int jumpGame(int n, String asf) {
        if (n == 0) {
            System.out.println(asf);
            return 1;
        }

        int count = 0;
        for (int jump = 1; jump <= 6 && n - jump >= 0; jump++) {
            count += jumpGame(n - jump, asf + jump);
        }

        return count;
    }

    public static int jumpGame_02(int[] jumps, int n, String asf) {
        if (n == 0) {
            System.out.println(asf);
            return 1;
        }

        int count = 0;
        for (int i = 0; i < jumps.length && n - jumps[i] >= 0; i++) {
            count += jumpGame_02(jumps, n - jumps[i], asf + jumps[i]);
        }

        return count;
    }

    public static void main(String[] args) {
        // System.out.println(jumpGame(10, ""));
        int[] jumps = { 2, 4, 7, 5, 1 };
        Arrays.sort(jumps);

    }
}