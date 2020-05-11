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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> store = new LinkedList<>();
        store.add(root);
        while(!store.isEmpty())
        {
            
            List<Integer> levelWise= new ArrayList<>();
            int sizeOfLevel=store.size();
            for(int i=0;i<sizeOfLevel;i++)
            {
                TreeNode temp= new TreeNode();
                temp= store.remove();
                levelWise.add(temp.val);
                if(temp.left!=null) store.add(temp.left);
                if(temp.right!=null) store.add(temp.right);
            }
            result.add(levelWise);
        }
        return result;
    }
}