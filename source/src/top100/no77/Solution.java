package top100.no77;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class Solution {
    ArrayList<List<Integer>> res = new ArrayList<>();
    //10 3
    public List<List<Integer>> combine(int n, int k) {
        back(new ArrayList<>(),1,n,k);
        return res;
    }
    //10
    public void back(List<Integer> list, int index,int all, int max){
        if(index > all || max == list.size()){
            if(max == list.size()) {
                res.add(new ArrayList(list));
            }
            return;
        }


        for (int i = index; i <= all; i++) {
            list.add(i);
            back(list,i + 1,all,max);
            list.remove(list.size() - 1);
        }
    }


}