package top100.no283;

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0,j = 0,n = nums.length;
        while(j < n){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
    }
}