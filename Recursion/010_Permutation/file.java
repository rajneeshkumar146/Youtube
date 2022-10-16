import java.util.List;
import java.util.ArrayList;

public class file {
    public int permute(int[] nums, int elementUsed, List<Integer> smallAns, List<List<Integer>> res) {
        if (elementUsed == nums.length) {
            List<Integer> baseRes = new ArrayList<>(smallAns);
            res.add(baseRes);
            return 1;
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -11) {
                int val = nums[i];
                nums[i] = -11;
                smallAns.add(val);

                count += permute(nums, elementUsed + 1, smallAns, res);

                smallAns.remove(smallAns.size() - 1);
                nums[i] = val;
            }
        }

        return count;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> smallAns = new ArrayList<>();
        permute(nums, 0, smallAns, res);
        return res;
    }

}