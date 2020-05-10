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
    
    public TreeNode construct(int[] preorder,int start,int end, int[]inorder, int startofin,int endofin)
    {
        if(start>end || startofin>endofin) return null;
        
        TreeNode root= new TreeNode();
        root.val=preorder[start];
        
        if(start==end || startofin==endofin) return root;
    
        int index=0;
        for(index=0;index<inorder.length;index++)
        {
            if(inorder[index]==preorder[start])
            {
                break;
            }
        }
        
        int inOrderStartLeft=startofin;
        int inOrderEndLeft=index-1;
        int preOrderStartLeft = start+1;
        int preOrderEndLeft = inOrderEndLeft- inOrderStartLeft+ preOrderStartLeft;
        
        int inOrderRightStart= index+1;
        int inOrderRightEnd= endofin;
        int preOrderStartRight= preOrderEndLeft+1;
        int preOrderEndRight=end;
            
        
        root.left=construct(preorder,preOrderStartLeft,preOrderEndLeft, inorder,inOrderStartLeft,inOrderEndLeft);
        root.right=construct(preorder,preOrderStartRight,preOrderEndRight, inorder,inOrderRightStart,inOrderRightEnd);
        return root;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root= new TreeNode();
        root= construct(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        
        return root;
        
    }
}