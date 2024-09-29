package top100.no15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> lists = new ArrayList<>();

        if(nums == null || nums.length < 3){
            return lists;
        }

        Arrays.sort(nums);

        int length = nums.length;
        for (int i = 0; i < length - 2; i++) {
            if(nums[i] > 0){
                break;
            }
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
             int left = i + 1;
             int right = length - 1;

             while(left < right){
                 int all = nums[i] + nums[left] + nums[right];
                 if(all == 0){
                     lists.add(Arrays.asList(nums[i],nums[left],nums[right]));
                     while (left < right && nums[left] == nums[left + 1]) left++;
                     while (left < right && nums[right] == nums[right - 1]) right--;
                     left ++ ;
                     right -- ;
                 }else if(all < 0){
                     left ++ ;
                 }else{
                     right --;
                 }
             }
        }

        return lists;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(lists);
    }
}