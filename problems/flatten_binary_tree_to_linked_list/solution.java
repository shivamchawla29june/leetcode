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
    public void flatten(TreeNode root) {
        if(root==null) return;
        flattenReturnEnd(root);
    }
    
    public TreeNode flattenReturnEnd(TreeNode root)
    {
        TreeNode left= new TreeNode();
        TreeNode right= new TreeNode();
        
        if(root.left!=null && root.right!=null)
        {
            right=flattenReturnEnd(root.right);
            left=flattenReturnEnd(root.left);
            left.right=root.right;
            root.right=root.left;
            root.left=null;
            return right;
        }
        else if(root.left!=null && root.right==null)
        {
            left=flattenReturnEnd(root.left);
            root.right=root.left;
            root.left=null;
            return left;
        }
        else if(root.left==null && root.right!=null)
        {
            return flattenReturnEnd(root.right);
        }
        return root;
    }
}