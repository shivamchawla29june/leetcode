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
    Stack<TreeNode> inOrder = new Stack<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;
        
        inOrder.push(root);
        while(!inOrder.isEmpty())
        {
            TreeNode peeking=inOrder.peek();
            if(peeking.left!=null)
            {
                inOrder.push(peeking.left);
                peeking.left=null;
            }
            else
            {
                TreeNode temp = inOrder.pop();
                result.add(temp.val);
                if(temp.right!=null) inOrder.push(temp.right);
            }
        }
        return result;
        
        
        
    }
}