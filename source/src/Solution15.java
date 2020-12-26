//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例： 
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针 
// 👍 2842 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        int k = 0;
        while (k < nums.length - 2 && nums[k] <= 0) {
            if (k > 0 && nums[k] == nums[k - 1]) {
                k++;
                continue;
            }
            int i = k + 1, j = nums.length - 1;
            int num = 0 - nums[k];
            while (i < j) {
                if (nums[i] + nums[j] == num) {
                    ret.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    while (++i < nums.length && nums[i] == nums[i - 1]) ;
                    while (--j > k + 1 && nums[j] == nums[j + 1]) ;
                } else if (nums[i] + nums[j] < num) {
//                    while(++i < nums.length && nums[i] == nums[i-1]){
//                    }
                    i++;
                } else {
//                    while(--j > k+1 &&  nums[j] == nums[j+1]){
//                    }
                    j--;
                }
            }

            k++;

        }
        return ret;
    }

    public static void main(String[] args) {
        new Solution15().threeSum(new int[]{-2,0,1,1,2});
    }
}
//leetcode submit region end(Prohibit modification and deletion)
