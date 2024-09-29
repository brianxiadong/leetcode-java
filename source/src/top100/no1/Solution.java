package top100.no1;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        //打印数组

        int[] ints = new Solution().twoSum(new int[]{3, 3}, 6);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}