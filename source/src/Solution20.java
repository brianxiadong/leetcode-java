//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 注意空字符串可被认为是有效字符串。 
//
// 示例 1: 
//
// 输入: "()"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "()[]{}"
//输出: true
// 
//
// 示例 3: 
//
// 输入: "(]"
//输出: false
// 
//
// 示例 4: 
//
// 输入: "([)]"
//输出: false
// 
//
// 示例 5: 
//
// 输入: "{[]}"
//输出: true 
// Related Topics 栈 字符串 
// 👍 2082 👎 0


import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution20 {
    public boolean isValid(String s) {
        if(s.length() == 0){
            return true;
        }

        Stack stack1 = new Stack();

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if(aChar == '(' || aChar == '[' || aChar == '{'){
                stack1.add(aChar);
            }else{
                if(aChar == ')' || aChar == ']' || aChar == '}'){
                    if(stack1.empty()){
                        return false;
                    }
                    char peek = (char)stack1.peek();
                    if((aChar == ')' && peek != '(') || (aChar == ']' && peek != '[') || (aChar == '}' && peek != '{')
                    ){
                        return false;
                    }else{
                        stack1.pop();
                    }
                }
            }
        }

        if(stack1.empty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution20().isValid("]"));
    }
}
//leetcode submit region end(Prohibit modification and deletion)
