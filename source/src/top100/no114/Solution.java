//package top100.no114;
//
//import javax.swing.tree.TreeNode;
//import java.sql.Array;
//import java.util.ArrayList;
//import java.util.List;
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
//    public void flatten(TreeNode root) {
//        ArrayList<TreeNode> treeNodes = new ArrayList<>();
//        search(root,treeNodes);
//        int size = treeNodes.size();
//        for (int i = 1; i < size; i++) {
//            TreeNode treeNode = treeNodes.get(i - 1);
//            treeNode.right = treeNodes.get(i);
//            treeNode.left = null;
//        }
//
//    }
//
//    public void search(TreeNode root, List<TreeNode> nodes){
//        if(root == null) return;
//        nodes.add(root);
//        search(root.left,nodes);
//        search(root.right,nodes);
//    }
//}