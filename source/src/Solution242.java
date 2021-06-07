//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 示例 1: 
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 输入: s = "rat", t = "car"
//输出: false 
//
// 说明: 
//你可以假设字符串只包含小写字母。 
//
// 进阶: 
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
// Related Topics 排序 哈希表 
// 👍 326 👎 0


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution242 {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] charA = s.toCharArray();
        char[] charB = t.toCharArray();
        Arrays.sort(charA);
        Arrays.sort(charB);

        for (int i = 0; i < charA.length; i++) {
            if(charA[i] != charB[i]){
                return false;
            }
        }

        return true;
    }


//    public boolean isAnagram(String s, String t) {
//        if(s.length() != t.length()){
//            return false;
//        }
//        int[] count = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            count[s.charAt(i) - 'a']++;
//            count[t.charAt(i) - 'a']--;
//        }
//
//        for (int i : count) {
//            if(i > 0){
//                return false;
//            }
//        }
//
//        return true;
//    }

//    public boolean isAnagram(String s, String t) {
//        Map map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if(map.containsKey(c)){
//                map.put(c,(int) map.get(c) + 1);
//            }else{
//                map.put(c,1);
//            }
//        }
//
//        for (int i = 0; i < t.length(); i++) {
//            char c = t.charAt(i);
//            if(!map.containsKey(c)){
//                return false;
//            }
//            int k = (int) map.get(c) - 1;
//            if(k == 0){
//                map.remove(c);
//            }else{
//                map.put(c,k);
//            }
//        }
//        if(map.keySet().size() > 0){
//            return false;
//        }else{
//            return true;
//        }
//    }

    public static void main(String[] args) {
        //System.out.println(new Solution242().isAnagram("anagram","nagaram"));
        System.out.println(new Solution242().isAnagram("a","a"));

    }
}
//leetcode submit region end(Prohibit modification and deletion)
