package top100.no94;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> integers = new ArrayList<Integer>();
        reserve(integers,root);

        return integers;
    }

    public void reserve(List<Integer> res, TreeNode root){
        if(root == null)
            return;
        reserve(res,root.left);
        res.add(root.val);
        reserve(res,root.right);
    }
}