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
    
    private boolean searchNode(TreeNode t1, TreeNode t2)
    {
        return t1!=null && (comparison(t1,t2) || searchNode(t1.left,t2) || searchNode(t1.right,t2));      
    }
    private boolean comparison(TreeNode t1, TreeNode t2)
    {
        if(t1==null&&t2==null) return true;
        if(t1==null||t2==null) return false;
        if(t1.val!=t2.val) return false;
        
        return comparison(t1.left,t2.left) && comparison(t1.right,t2.right);
    }
    
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return searchNode(s,t); 
    }
}