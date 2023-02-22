# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        result = [root.val]
        
        def dfs(root):
            if not root:
                return 0
            
            leftTree = dfs(root.left)
            rightTree = dfs(root.right)
            leftTreeMax = max(leftTree, 0)
            rightTreeMax = max(rightTree,0)
            
            result[0] = max(result[0], leftTreeMax + rightTreeMax + root.val)
            
            return max(leftTreeMax, rightTreeMax) + root.val
        
        dfs(root)
        return result[0]
        
        