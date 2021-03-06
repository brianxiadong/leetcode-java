//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//
// 示例 1:
//
// 输入: 121
//输出: true
//
//
// 示例 2:
//
// 输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
//
//
// 示例 3:
//
// 输入: 10
//输出: false
//解释: 从右向左读, 为 01 。因此它不是一个回文数。
//
//
// 进阶:
//
// 你能不将整数转为字符串来解决这个问题吗？
// Related Topics 数学
// 👍 1346 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution9 {
//    public int reverse(int x) {
//
//        int ret = 0;
//        while (x != 0){
//            int pop = x % 10;
//            if (ret > Integer.MAX_VALUE / 10 || (ret == Integer.MAX_VALUE / 10 && pop > 7))
//                return 0;
//            if (ret < Integer.MIN_VALUE / 10 || (ret == Integer.MIN_VALUE / 10 && pop < -8))
//                return 0;
//
//            x = x / 10 ;
//            ret = ret * 10 + pop;
//        }
//        return ret;
//    }

    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revert = 0;
        while(revert < x){
            revert = revert * 10 + x % 10;
            x /= 10;
        }

        return revert == x || x == revert / 10;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
