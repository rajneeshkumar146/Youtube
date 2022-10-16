import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class file {
    public int letterCombinations_helper(String digits, int idx, String asf, List<String> res,
            Map<Character, String> keys) {
        if (idx == digits.length()) {
            res.add(asf);
            return 1;
        }

        String key = keys.get(digits.charAt(idx));
        int count = 0;
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            count += letterCombinations_helper(digits, idx + 1, asf + ch, res, keys);
        }

        return count;
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0)
            return res;
        Map<Character, String> keys = new HashMap<Character, String>();
        keys.put('2', "abc");
        keys.put('3', "def");
        keys.put('4', "ghi");
        keys.put('5', "jkl");
        keys.put('6', "mno");
        keys.put('7', "pqrs");
        keys.put('8', "tuv");
        keys.put('9', "wxyz");

        int ans = letterCombinations_helper(digits, 0, "", res, keys);
        return res;
    }

    public static void main(String[] args) {

    }

}