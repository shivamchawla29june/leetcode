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
    int max_level=0;
    List<Integer> result= new ArrayList<>();

    private void rightSideHelper(TreeNode root,int current_level)
    {
        if(root==null) return;
        
        if(current_level>max_level) 
        {
            result.add(root.val);
            max_level=current_level;
        }
        
        rightSideHelper(root.right,current_level+1);
        rightSideHelper(root.left,current_level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return result;
        
        rightSideHelper(root,1);
        return result;
        

        
    }
}