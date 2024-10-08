//package top100.no108;
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//class Solution {
//    public TreeNode sortedArrayToBST(int[] nums) {
//        return create(nums,0,nums.length - 1);
//    }
//
//    public TreeNode create(int[] nums,int left,int right){
//        if(left > right) return  null;
//
//        int mid = left + (right - left) / 2;
//        TreeNode treeNode = new TreeNode(nums[mid]);
//        treeNode.left = create(nums,left,mid - 1);
//        treeNode.right = create(nums,mid + 1,right);
//        return treeNode;
//    }
//}