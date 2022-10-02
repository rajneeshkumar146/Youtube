public class file {
    // S: O(N), T: O(N)
    public static void display(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }

        System.out.println(arr[idx]);
        display(arr, idx + 1);
    }

    // S: O(N), T: O(N)
    public static void displayReverse(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }

        displayReverse(arr, idx + 1);
        System.out.println(arr[idx]);
    }

    public static boolean findEle(int[] arr, int data, int idx) {
        if (idx == arr.length) {
            return false;
        }

        if (arr[idx] == data) {
            return true;
        }

        return findEle(arr, data, idx + 1);
    }

    public static boolean findEle_OneLiner(int[] arr, int data, int idx) {
        return idx == arr.length ? false : arr[idx] == data || findEle(arr, data, idx + 1);
    }

    public static int firstIndex(int[] arr, int data, int idx) {
        if (idx == arr.length) {
            return -1;
        }

        if (arr[idx] == data)
            return idx;

        return firstIndex(arr, data, idx + 1);
    }

    public static int lastIndex(int[] arr, int data, int idx) {
        if (idx == -1) {
            return -1;
        }

        if (arr[idx] == data)
            return idx;

        return lastIndex(arr, data, idx - 1);
    }

    public static int lastIndex_01(int[] arr, int data, int idx) {
        if (idx == -1) {
            return -1;
        }

        int ans = lastIndex_01(arr, data, idx + 1);
        if (ans != -1)
            return ans;

        return arr[idx] == data ? idx : -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 435, 2, 455, 34, 56, 78, 12, 2, -5, -45 };
        // display(arr, 0);

        int ans = lastIndex(arr, 2, arr.length - 1);

    }
}