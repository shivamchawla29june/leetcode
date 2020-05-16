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
    private TreeNode conversion(int[] arr, int start,int end)
    {
        if(start>end) return null;
        int middle=start+(end-start)/2;
        TreeNode root=new TreeNode(arr[middle]);
        root.left=conversion(arr,start,middle-1);
        root.right=conversion(arr,middle+1,end);
        
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return conversion(nums,0,nums.length-1);        
    }
}