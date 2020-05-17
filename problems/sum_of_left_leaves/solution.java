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
    int sum=0;
    
    private int sumHelper(TreeNode root)
    {
        if(root==null) return 0;
        
        if(root.left!=null && root.left.left==null && root.left.right==null) sum+=root.left.val;
        
        sumHelper(root.left);
        sumHelper(root.right);

        return sum;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return sumHelper(root);
    }
}