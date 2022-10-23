# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        def isSymmetricHelper(leftTree, rightTree):
            leftSide=False
            rightSide = False
            if leftTree==None and rightTree==None:
                return True
            if leftTree==None or rightTree==None or leftTree.val != rightTree.val:
                return False
            leftSide = isSymmetricHelper(leftTree.left, rightTree.right)
            rightSide = isSymmetricHelper(leftTree.right, rightTree.left)
            return leftSide and rightSide
            
        if root == None:
            return True
        return isSymmetricHelper(root.left, root.right)
