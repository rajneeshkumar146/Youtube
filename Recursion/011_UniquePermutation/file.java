import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class file {
    public void permuteUnique(int[] nums, int numberUsed, List<Integer> smallAns, List<List<Integer>> res) {
        if (numberUsed == nums.length) {
            List<Integer> base = new ArrayList<>(smallAns);
            res.add(base);
            return;
        }

        int prevNum = -11;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -11 && prevNum != nums[i]) {
                int val = nums[i];
                nums[i] = -11;
                smallAns.add(val);

                permuteUnique(nums, numberUsed + 1, smallAns, res);

                nums[i] = val;
                smallAns.remove(smallAns.size() - 1);
            }

            prevNum = nums[i];
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> smallAns = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        permuteUnique(nums, 0, smallAns, res);
        return res;
    }

    public static void main(String[] args) {

    }
}