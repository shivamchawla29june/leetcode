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
    ArrayList<Integer> values= new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        if(root==null) return null;
        traversal(root);
        sortList();
        return convertBalanced(0,values.size()-1);
    }
    
    private void traversal(TreeNode root)
    {
        if(root==null) return;
        
        values.add(root.val);
        traversal(root.left);
        traversal(root.right);
    }
    private void sortList()
    {
        Collections.sort(values);
    }
    
    private TreeNode convertBalanced(int start,int end)
    {
        if(start>end) return null;
        
        int middle=start+ (end-start)/2;
        TreeNode root=new TreeNode(values.get(middle));
        
        root.left=convertBalanced(start,middle-1);
        root.right=convertBalanced(middle+1,end);
        
        return root; 
    }
}