//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。 
//
// 
//
// 示例： 
//
// 输入：n = 3
//输出：[
//       "((()))",
//       "(()())",
//       "(())()",
//       "()(())",
//       "()()()"
//     ]
// 
// Related Topics 字符串 回溯算法 
// 👍 1506 👎 0


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution22 {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> strings = new ArrayList<>();
        add("",0,2*n,strings);
        return strings;
    }

    public void add(String str,int n,int max,List<String> strs){
        if(n >= max){
            strs.add(str);
            return;
        }

        add(str+"(",n+1,max,strs);
        add(str+")",n+1,max,strs);

    }

    public static void main(String[] args) {
        System.out.println(new Solution22().generateParenthesis(3));
    }
    
}
//leetcode submit region end(Prohibit modification and deletion)
