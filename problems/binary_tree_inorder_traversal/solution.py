# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        result=[]
        def helper(root):
            if root.left == None and root.right == None:
                result.append(root.val)
                return
            if root.left != None:
                helper(root.left)
            result.append(root.val)
            if root.right!=None:
                helper(root.right)
        if root == None:
            return result
        helper(root)
        return result
