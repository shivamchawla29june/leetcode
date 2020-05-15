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
    private boolean isValidBSTHelper(TreeNode root,Integer lower,Integer higher)
    {
        if(root==null) return true;
        
        if(lower!=null && root.val<=lower) return false;
        if(higher!=null && root.val>=higher) return false;
        
        boolean left=isValidBSTHelper(root.left,lower,root.val);
        boolean right=isValidBSTHelper(root.right,root.val,higher);
        
        return left&&right;
        
    }
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root,null,null);
        
    }
}