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
    Stack<TreeNode> leftRight= new Stack<>();
    Stack<TreeNode> rightLeft= new Stack<>();
    
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {     
        leftRight.push(root);
        zigzagHelper(root);
        return result;
    }
    
    private void zigzagHelper(TreeNode root)
    {
        if(root==null) return;        
        
        while(!leftRight.isEmpty() || !rightLeft.isEmpty())
        {
            List<Integer> levelWise =new ArrayList<>();
            while(!leftRight.isEmpty())
            {
                TreeNode temp=leftRight.pop();
                levelWise.add(temp.val);
                if(temp.left!=null) rightLeft.push(temp.left);
                if(temp.right!=null) rightLeft.push(temp.right);
            }
            if(levelWise.size()!=0) result.add(levelWise);
            levelWise =new ArrayList<>();
            while(!rightLeft.isEmpty())
            {
                TreeNode temp=rightLeft.pop();
                levelWise.add(temp.val);
                if(temp.right!=null) leftRight.push(temp.right);
                if(temp.left!=null) leftRight.push(temp.left);
            }
           if(levelWise.size()!=0) result.add(levelWise);
        }
        
    }
}