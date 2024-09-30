package top100.no3;

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> characters = new HashSet<>();

        int length = s.length();
        if(length == 0) return 0;
        int max = 1;
        for (int i = 0; i < length; i++) {
            characters.clear();
            for (int j = i; j < length; j++) {
                if(j == length - 1 || characters.contains(s.charAt(j))){
                    int now = characters.contains(s.charAt(j)) ?  j- i  : j - i + 1;
                    if(now > max) max = now;
                    break;
                }
                characters.add(s.charAt(j));
            }

        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("bbbbb"));
    }
}