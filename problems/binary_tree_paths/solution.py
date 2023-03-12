# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        result = []
        def traversal(root, s=""):
            if s == "":
                s+=str(root.val)
            else:
                s +="->"+str(root.val)

            if root.left == None and root.right == None:
                result.append(s)
                return
            
            if root.left:
                traversal(root.left, s)
            if root.right:
                traversal(root.right, s)

        if root:
            traversal(root, "")
        return result
            


            