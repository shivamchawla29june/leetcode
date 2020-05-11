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
    private TreeNode construct(int[] inorder, int[] postorder,int StartofIn,int EndofIn,int StartofPost,int EndofPost)
    {
        if(StartofIn>EndofIn|| StartofPost>EndofPost) return null;
        
        TreeNode root= new TreeNode(postorder[EndofPost]);
        if(StartofIn==EndofIn) return root;
        
        int index=0;
        for(index=0;index<EndofIn;index++)
        {
            if(postorder[EndofPost]==inorder[index]) break;
        }
        
        int StartofInL=StartofIn;
        int EndofInL=index-1;
        int StartofPostL=StartofPost;
        int EndofPostL=index-StartofIn-1+StartofPost;
        
        int StartofInR=index+1;
        int EndofInR=EndofIn;
        int StartofPostR=EndofPostL+1;
        int EndofPostR=EndofInR-StartofInR+StartofPostR;
        
//        System.out.println(StartofInL+"   "+EndofInL+"    "+StartofPostL+"    "+EndofPostL);
//        System.out.println(StartofInR+"   "+EndofInR+"    "+StartofPostR+"    "+EndofPostR);
        
        
        root.left=construct(inorder,postorder,StartofInL,EndofInL,StartofPostL,EndofPostL);
        root.right=construct(inorder,postorder,StartofInR,EndofInR,StartofPostR,EndofPostR);
        
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root= new TreeNode();
        root= construct(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
        return root;
        
    }
}