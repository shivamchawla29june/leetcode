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
    
    private void levelOrderTraversal(TreeNode root,StringBuilder sb)
    {
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode temp = q.remove();
            if(temp==null)
            {
                sb.append("n,");
            }
            else
            {
                sb.append(temp.val+",");
                q.add(temp.left);
                q.add(temp.right);               
            }
        }
    }
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if(root==null) return "";
        levelOrderTraversal(root, sb);
        System.out.println(sb);
        return sb.toString().trim();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        String[] s= data.split(",");
        Queue<TreeNode> deser= new LinkedList<>();
        TreeNode root= new TreeNode(Integer.parseInt(s[0]));
        deser.add(root);
        for(int i=1;i<s.length;)
        {
            TreeNode temp=deser.remove();
            if(!s[i].equals("n"))
            {
                temp.left=new TreeNode(Integer.parseInt(s[i]));
                deser.add(temp.left);
            }
            else
            {
                temp.left=null;
            }
            i++;
            if(i<s.length)
            {
                if(!s[i].equals("n"))
                {
                    temp.right=new TreeNode(Integer.parseInt(s[i]));
                    deser.add(temp.right);
                }
                else
                {
                    temp.right=null;
                }
                i++;                
            }            
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));