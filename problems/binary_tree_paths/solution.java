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
    String start ="";
    List<String> result= new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {        
        helperPath(root,start);
        return result;        
    }
    private void helperPath(TreeNode root,String s)
    {
        if(root==null) return;
        s=s+"->"+root.val;
        if(root.left==null && root.right==null)
        {
            result.add(s.substring(2));
            return;
        }
        
        helperPath(root.left,s);
        helperPath(root.right,s);
    }
}