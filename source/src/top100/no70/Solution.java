package top100.no70;

class Solution {
    public int climbStairs(int n) {
        int a = 1,b= 1,c = 1;
        for (int i = 0; i < n - 1; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}