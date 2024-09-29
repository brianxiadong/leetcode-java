package top100.no49;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> maps = new HashMap<String,List<String>>();

        for (String str : strs) {

            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String newStr = new String(charArray);

            List<String> list = maps.getOrDefault(newStr, new ArrayList<>());
            list.add(str);

            maps.put(newStr,list);
        }

        return new ArrayList<>(maps.values());
    }
}