# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        result = []
        if root == None:
            return result
        rowWiseElements = []
        rowWiseElements.append(root)
        while len(rowWiseElements) != 0:
            
            sizeOfCurrentLevel = len(rowWiseElements)
            levelList = []
            for _ in range(sizeOfCurrentLevel):
                current = rowWiseElements.pop(0)
                levelList.append(current.val)
                if current.left:
                    rowWiseElements.append(current.left)
                if current.right:
                    rowWiseElements.append(current.right)            
            result.append(levelList)
        return result
                
        