package top100.no238;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            left[i] = i == 0? nums[0] : left[i - 1] * nums[i];
            right[length - 1 - i] = i == 0? nums[length - 1] : right[length - i] * nums[length - 1 - i];
        }

        result[0] = right[1];
        result[length - 1] = left[length - 2];
        for (int i = 1; i < length - 1; i++) {
            result[i] = left[i - 1] * right[i  + 1];
        }
        return result;
    }

    public static void main(String[] args) {
        new Solution().productExceptSelf(new int[]{1,2,3,4
});
    }
}