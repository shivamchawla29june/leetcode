# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
import sys
max_size = sys.maxsize
min_size = -sys.maxsize - 1

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        if root == None:
            return True
        
        def isValidBSTHelper(root, minValue, maxValue):
            if root == None:
                return True
            
            if root.val >= maxValue or root.val <= minValue:
                return False
            
            leftTree = isValidBSTHelper(root.left, minValue, root.val)
            rightTree = isValidBSTHelper(root.right, root.val, maxValue)
            return leftTree and rightTree
            
        return isValidBSTHelper(root, min_size, max_size)
        