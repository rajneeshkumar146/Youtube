public class file {
    public static void ffffff(int n) {
        System.out.println("Base: " + n);
    }

    public static void fffff(int n) {
        System.out.println("Hi: " + n);
        ffffff(n - 1);
        System.out.println("Bye: " + n);
    }

    public static void ffff(int n) {
        System.out.println("Hi: " + n);
        fffff(n - 1);
        System.out.println("Bye: " + n);
    }

    public static void fff(int n) {
        System.out.println("Hi: " + n);
        ffff(n - 1);
        System.out.println("Bye: " + n);
    }

    public static void ff(int n) {
        System.out.println("Hi: " + n);
        fff(n - 1);
        System.out.println("Bye: " + n);
    }

    public static void f(int n) {
        System.out.println("Hi: " + n);
        ff(n - 1);
        System.out.println("Bye: " + n);
    }

    // =================================================================

    public static void printHiByePattern(int n) {
        if (n == 0) {
            System.out.println("Base: " + n);
            return;
        }

        System.out.println("Hi: " + n);
        printHiByePattern(n - 1);
        System.out.println("Bye: " + n);
    }

    public static void main(String[] args) {
        printHiByePattern(10);
    }
}