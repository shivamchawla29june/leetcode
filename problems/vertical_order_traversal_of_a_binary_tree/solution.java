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
    TreeMap<Integer,List<Pair<Integer,Integer>>> storing = new TreeMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        verticalTraversalHelper(root,0,0);
//        System.out.println(storing);
        
        for(Map.Entry<Integer,List<Pair<Integer,Integer>>> m:storing.entrySet())  
        {  
            List<Pair<Integer,Integer>> temp =m.getValue();
            List<Integer> levelWise = new ArrayList<>();
//            System.out.println(temp);
            temp.sort(new Comparator<Pair<Integer,Integer>>(){
                @Override
                public int compare(final Pair<Integer, Integer> o1, final Pair<Integer, Integer> o2) {
                    int check=o1.getKey()-o2.getKey();
                    if(check!=0)
                        return o1.getKey()-o2.getKey();
                    return o1.getValue()-o2.getValue();
                }
            });
            while(!temp.isEmpty())
            {
                levelWise.add(temp.remove(0).getValue());
            }
            result.add(levelWise);
        }        
        return result;      
    }
    private void verticalTraversalHelper(TreeNode root, int distanceX,int distanceY)
    {
        if(root==null) return;
        if(!storing.containsKey(distanceX))
        {
            List<Pair<Integer,Integer>> temp= new ArrayList<>();
            Pair<Integer,Integer> group = new Pair<>(distanceY,root.val);
            temp.add(group);
            storing.put(distanceX,temp);
        }
        else
        {
            List<Pair<Integer,Integer>> temp= new ArrayList<>(storing.get(distanceX));
            Pair<Integer,Integer> group = new Pair<>(distanceY,root.val);
            temp.add(group);
            storing.replace(distanceX,temp);
        }
        
        verticalTraversalHelper(root.left,distanceX-1,distanceY+1);
        verticalTraversalHelper(root.right,distanceX+1,distanceY+1);
        
        
    }
}