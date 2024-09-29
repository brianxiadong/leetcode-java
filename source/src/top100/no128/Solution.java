package top100.no128;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int now,longest = 0;
        for (Integer i : set) {
            now = 1;
            if(set.contains(i - 1)){
                //比其小的还有，从小的出发，跳过这个
                continue;
            }

            for (int j = i + 1; ;j++){
                if(set.contains(j)){
                    now++;
                }else{
                    break;
                }
            }

            if(now > longest){
                longest = now;
            }
        }

        return longest;
    }
}