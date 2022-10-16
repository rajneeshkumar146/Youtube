import java.lang.reflect.Array;
import java.util.ArrayList;

public class file {
    public static int subsequence(String str, int idx, String asf,ArrayList<String> res) {
        if (idx == str.length()) {
            res.add(asf);
            return 1;
        }

        int count = 0;
        count += subsequence(str, idx + 1, asf,res); // Not Pick
        count += subsequence(str, idx + 1, asf + str.charAt(idx),res); // Pick

        return count;
    }

    public static void main(String[] args) {
        String str = "abc";
        String asf = "";
        ArrayList<String> res = new ArrayList<>();

        System.out.println(subsequence(str, 0, asf,res));
        System.out.println(res);
    }
}