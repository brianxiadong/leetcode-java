package top100.no560;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int add = nums[i];
            if(add == k){
                count++;
            }

            for (int j = i + 1; j < nums.length; j++) {
                add += nums[j];
                if(add == k){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().subarraySum(new int[]{1,1,1},3));
    }
}