package top100.no347;

import java.util.*;
import java.util.function.ToIntFunction;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2) - map.get(o1);
            }
        });

        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            queue.add(integer);
        }
        int[] ints = new int[k];
        for (int i = 0; i < k; i++) {
            Integer poll = queue.poll();
            ints[i] = poll;
        }
        return ints;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.topKFrequent(new int[]{4,1,-1,2,-1,2,3},2));
    }
}