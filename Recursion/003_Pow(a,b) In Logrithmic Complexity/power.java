public class power {

    public static int power_basic(int a, int b) {
        if (b == 0) {
            return 1;
        }

        int smallAns = power_basic(a, b - 1);
        return smallAns * a;
    }

    public static int power_basic_01(int a, int b) {
        return b == 0 ? 1 : power_basic_01(a, b - 1) * a;
    }

    public static int power_opti(int a, int b) {
        if (b == 0) {
            return 1;
        }

        int smallAns = power_opti(a, b / 2);
        smallAns *= smallAns;

        return b % 2 == 0 ? smallAns : smallAns * a;
    }

    public static void main(String[] args) {
        int a = 2, b = 10;
        int ans = power_opti(a, b);
        System.out.println(ans);
    }
}