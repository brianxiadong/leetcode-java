package top100.no80;

class Solution {
    public int removeDuplicates(int[] nums) {
        int now = nums[0];
        int count = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if(now < nums[i]){
                now = nums[i];
                count = 1;
                continue;
            }
            if(count < 2){
                count++;
            }else{
                nums[i] = Integer.MAX_VALUE;
            }
        }

        //1 1 2 2 m 3 3 m m 4
        //1 1 2 2 3
        int i = 0;
        for (int j = 0; j < length; i++,j++) {
            if(nums[j] == Integer.MAX_VALUE){
                while(j < length && nums[j] == Integer.MAX_VALUE){
                    j++;
                }
            }

            if(j == length) break;
            nums[i] = nums[j];
        }

        return i;
    }

    public static void main(String[] args) {
        new Solution().removeDuplicates(new int[] {1,1,1,2,2,2,3,3});
    }
}