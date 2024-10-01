package top100.no118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(1));
        if(numRows == 1) return lists;
        lists.add(Arrays.asList(1,1));
        for (int i = 3; i <= numRows; i++) {
            ArrayList<Integer> integers = new ArrayList<>();
            lists.add(integers);
            for (int j = 0; j < i; j++) {
                if(j == 0) integers.add(1);
                else if (j == i - 1) integers.add(1);
                else{
                    List<Integer> list = lists.get(i - 2);
                    integers.add(list.get(j-1) + list.get(j));
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().generate(5));
    }
}