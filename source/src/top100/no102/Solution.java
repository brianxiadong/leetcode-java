//package top100.no102;
//
//import javax.swing.tree.TreeNode;
//import java.util.*;
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
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        Queue<TreeNode> treeNodes = new LinkedList<>();
//        List<List<Integer>> lists = new ArrayList<>();
//        if(root != null) treeNodes.add(root);
//        while(!treeNodes.isEmpty()){
//            ArrayList<Integer> layers = new ArrayList<>();
//            lists.add(layers);
//            for(int i = treeNodes.size(); i > 0; i--) {
//                TreeNode treeNode = treeNodes.poll();
//                layers.add(treeNode.val);
//                if(treeNode.left != null){
//                    treeNodes.add(treeNode.left);
//                }
//                if(treeNode.right != null){
//                    treeNodes.add(treeNode.right);
//                }
//            }
//
//        }
//
//        return lists;
//    }
//}