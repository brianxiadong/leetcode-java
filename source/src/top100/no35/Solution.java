package top100.no35;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0,right = nums.length - 1;
        while(left <= right){
            int mid = (right + left) / 2;
            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[]{1,3,5,6} , 7));
    }
}