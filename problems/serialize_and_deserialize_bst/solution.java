/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    
    private void serializeHelper(TreeNode root,StringBuilder sb)
    {
        if(root==null) return ;

        sb.append(root.val).append(',');
        serializeHelper(root.left,sb);
        serializeHelper(root.right,sb);
    }
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        StringBuilder sb= new StringBuilder();
        serializeHelper(root,sb);
        return sb.deleteCharAt(sb.length()-1).toString();
    }
    
    private TreeNode deserializeHelper(int[] nums,int start,int end)
    {
        if(start>end) return null;
        
        if(start==end) return new TreeNode(nums[start]);
        int middle=start;
        for(;middle<=end;middle++)
        {
            if(nums[middle]>nums[start])
                break;
        }
        
        TreeNode root=new TreeNode(nums[start]);
        
        root.left=deserializeHelper(nums,start+1,middle-1);
        root.right=deserializeHelper(nums,middle,end);

        return root;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        
        String[] s = data.split(",");        
        int[] arr= new int[s.length];

        for(int i=0;i<s.length;i++)
        {
            arr[i]=Integer.parseInt(s[i]);
        }
        
        return deserializeHelper(arr,0,s.length-1);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));