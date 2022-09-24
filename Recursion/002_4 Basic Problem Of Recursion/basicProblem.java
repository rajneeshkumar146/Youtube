public class basicProblem {
    public static void printIncreasing(int a, int b) {
        if (a > b) {
            return;
        }

        System.out.println(a);
        printIncreasing(a + 1, b);
    }

    public static void printDecreasing(int a, int b) {
        if (a > b) {
            return;
        }

        printDecreasing(a + 1, b);
        System.out.println(a);
    }

    public static void printEvenOdd(int a, int b) {
        if (a > b) {
            return;
        }

        if(a % 2 == 0) System.out.println(a);
        printEvenOdd(a + 1, b);
        if(a % 2 != 0) System.out.println(a);
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }

        int smallAns = factorial(n - 1);
        return smallAns * n;
    }

    public static void main(String[] args) {
        // printEvenOdd(1, 10);
        int ans = factorial(5);
        System.out.println(ans);
    }
}