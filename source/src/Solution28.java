//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 
// 👍 898 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution28 {
    public void moveZeroes(int[] nums) {
//        int index = nums.length;
//        int temp = 0;
//        while(true){
//            int i = 0;
//            for(;i <= index - 1;i++){
//                if(nums[i] == 0){
//                    break;
//                }
//            }
//
//            if(index == i){
//                break;
//            }
//
//            for(int j = i + 1;j <= index - 1;j++){
//                temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//                i++;
//            }
//
//            index -- ;
//        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[j] = nums[i];
                if(i != j){
                    nums[i] = 0;
                }
                j++;
            }
        }
    }


    public static void main(String[] args) {
        int [] test = new int[]{0,1,0,3,12};
        new Solution28().moveZeroes(test);
        for (int i : test) {
            System.out.println(i);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
