package top100.no58;

class Solution {
    public int lengthOfLastWord(String s) {
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        int count = 0;
        for (int i = length - 1; i >= 0; i--) {
               if(charArray[i] == ' '){
                   if(count > 0){
                       return count;
                   }
               }else{
                   count++;
               }
        }

        return count;
    }
}