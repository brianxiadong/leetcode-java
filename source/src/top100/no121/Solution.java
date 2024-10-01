package top100.no121;

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0,cost = Integer.MAX_VALUE;
        for (int price : prices) {
            cost = Math.min(cost,price);
            max = Math.max(max,price - cost);
        }
        return max;
    }
}