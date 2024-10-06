package top100.no189;

import java.util.Arrays;
import java.util.List;

class Solution {
    public void rotate(int[] nums, int k) {
        if(k == 0) return;
        int length = nums.length;
        int[] copy = Arrays.copyOf(nums, length);
        //[2,3,4,5,6]  12 % 5 = 2
        //[    2 ]  4
        int move = k % length;
        int first = nums[0];
        for (int i = 0; i < length; i++) {
            int pos = (i + move) % length;
            nums[pos] = copy[i];
        }

    }
}