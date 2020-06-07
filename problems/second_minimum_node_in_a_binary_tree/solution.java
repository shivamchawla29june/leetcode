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
    long result=Long.MAX_VALUE;
    
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null) return -1;
        searchDFS(root);
        return result==Long.MAX_VALUE?-1:(int)result;        
    }
    private void searchDFS(TreeNode root)
    {
        if(root.left!=null && root.left.val==root.val)
        {
            searchDFS(root.left);            
        }
        if(root.right!=null && root.right.val==root.val)
        {
            searchDFS(root.right);
        }
        if(root.left!=null && root.left.val>root.val)
        {
            result=Math.min(root.left.val,result);            
        }
        if(root.right!=null && root.right.val>root.val)
        {
            result=Math.min(root.right.val,result);
        }
    }
}