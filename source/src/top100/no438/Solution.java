package top100.no438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] charArray = p.toCharArray();
        Arrays.sort(charArray);

        int length = s.length();
        int lengthp = p.length();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < length - lengthp + 1; i++) {
            String sub = s.substring(i , i + lengthp);
            char[] ca = sub.toCharArray();
            Arrays.sort(ca);
            if(Arrays.equals(charArray,ca)){
                res.add(i);
            }
        }


        return res;
    }
}