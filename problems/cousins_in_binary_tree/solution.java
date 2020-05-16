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
        
    int levelofNode=0;
    TreeNode parentNode=null;
    
    private void search(TreeNode root, int k, TreeNode parent, int level)
    {
        if(root==null) return;
        
        if(root.val==k) 
        {
            levelofNode=level;
            parentNode=parent;
            return;
        }
        
        if(root.left!=null) search(root.left,k,root,level+1);
        if(root.right!=null) search(root.right,k,root,level+1);
        
    }
    
    public boolean isCousins(TreeNode root, int x, int y) {
        search(root,x,null,0);
        int level1=levelofNode;
        TreeNode parent1=parentNode;
        search(root,y,null,0);
        int level2=levelofNode;
        TreeNode parent2=parentNode;
        return (level1==level2)&&(parent1!=parent2);
        
        
    }
}