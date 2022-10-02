public class file {
    // psf : Path So Far
    public static int eulerPath(int n, String psf) {
        if (n <= 1) {
            System.out.println(psf);
            System.out.println("Base: " + n);
            return 3;
        }

        int count = 0;

        System.out.println("Pre: " + n);

        count += eulerPath(n - 1, psf + "L");
        System.out.println("In: " + n);
        count += eulerPath(n - 2, psf + "R");

        System.out.println("Post: " + n);

        return count;
    }

    // psf : Path So Far
    public static int eulerPath_02(int n, String psf) {
        if (n <= 2) {
            System.out.println(psf);
            System.out.println("Base: " + n);
            return n + 3;
        }

        int count = 0;

        System.out.println("Pre: " + n);

        count += eulerPath_02(n - 1, psf + "L");
        System.out.println("In1: " + n);

        count += eulerPath_02(n - 2, psf + "R");
        System.out.println("In1: " + n);

        count += eulerPath_02(n - 3, psf + "R");
        System.out.println("Post: " + n);

        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(eulerPath(5, ""));

    }
}