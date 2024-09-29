package top100.no1;

import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        //打印数组

        int[] ints = new Solution2().twoSum(new int[]{3, 3}, 6);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}