import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(n)
// Space Complexity : O(1).
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


public class NumbersDissappearedInArray {

    public static void main(String[] args)
    {
//        int[] nums = {4,3,2,7,8,2,3,1};
        int[] nums = {1,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> result = new ArrayList();
        int n = nums.length;

        for(int i = 0; i < n; i++) {

            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx] < 0) {
                continue;
            }

            nums[idx] = nums[idx] * -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
