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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Pair<Integer,Integer> values= new Pair<>(0,0);
        values=diameterHelper(root);
        return values.getValue();
    }
    
    public Pair<Integer,Integer> diameterHelper(TreeNode root)
    {
        Pair<Integer,Integer> pair1= new Pair<>(0,0);
        Pair<Integer,Integer> pair2= new Pair<>(0,0);
        
        if(root==null) 
        {
            Pair<Integer,Integer> group=new Pair<>(0,0);
            return group;
        }
        
        pair1=diameterHelper(root.left);
        pair2=diameterHelper(root.right);
        
        int diameter=Math.max((pair1.getKey()+pair2.getKey()),Math.max(pair1.getValue(),pair2.getValue()));
        int height= 1+Math.max(pair1.getKey(),pair2.getKey());

        Pair<Integer,Integer> group=new Pair<>(height,diameter);
        return group;
        
    }
}