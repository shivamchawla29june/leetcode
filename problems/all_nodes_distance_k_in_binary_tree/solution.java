/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> result = new ArrayList<>();
    private int search(TreeNode root, TreeNode find,int k)
    {
        if(root==null) return -1;
        if(find==root) 
        {
            levelPrint(root,k);
            return 0;
        }
        int left=search(root.left,find,k);
        if(left!=-1)
        {
            TreeNode temp=root;
            temp.left=null;
            levelPrint(temp,k-1-left);
            return left+1;
            
        }
        int right=search(root.right,find,k);
        if(right!=-1)
        {
            TreeNode temp=root;
            temp.right=null;
            levelPrint(temp,k-1-right);
            return right+1;
            
        }
        return -1;
    }
    private void levelPrint(TreeNode root,int levelWise)
    {
        
        if(root==null) return ;
        if(levelWise==0) 
        {
            result.add(root.val);
            return;
        }
        levelPrint(root.left,levelWise-1);
        levelPrint(root.right,levelWise-1);
        
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        search(root,target,K);
        return result;
        
    }
}