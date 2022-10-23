# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        def maxDepthHelper(root):
            leftTreeDepth=0
            rightTreeDepth=0
            if root.left ==None and root.right == None:
                return 1
            if root.left != None:
                leftTreeDepth = maxDepthHelper(root.left)
            if root.right != None:
                rightTreeDepth = maxDepthHelper(root.right)
            return 1 + max(leftTreeDepth, rightTreeDepth)
        if root == None:
            return 0
        return maxDepthHelper(root)
        