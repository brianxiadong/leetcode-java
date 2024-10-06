//package top100.no230;
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
//    int res,k;
//    public int kthSmallest(TreeNode root, int k) {
//        this.k = k;
//        search(root);
//        return res;
//    }
//
//    public void search(TreeNode root){
//        if(root == null) return;
//        search(root.left);
//        if(k == 0) return;
//        if(--k == 0){
//            res = root.val;
//            return;
//        }
//        search(root.right);
//    }
//}