package top100.no20;

import java.util.HashMap;
import java.util.Stack;

class Solution {
    static HashMap<Character, Character> map = new HashMap<>();
    static {
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
    }
    public boolean isValid(String s) {
        if(s.isEmpty()) return true;
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if(map.containsKey(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                Character pop = stack.pop();
                if(map.get(pop) != c) return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean valid = new Solution().isValid("()");
        System.out.println(valid);
    }
}