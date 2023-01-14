# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        leftRight = []
        rightLeft = []
        result = []
        if root == None:
            return result
        leftRight.append(root)
        while len(leftRight) != 0 or len(rightLeft) != 0:
            if len(leftRight) != 0:
                sizeOfCurrentLevel = len(leftRight)
                levelList = []
                for _ in range(sizeOfCurrentLevel):
                    current = leftRight.pop()
                    levelList.append(current.val)
                    if current.left:
                        rightLeft.append(current.left)
                    if current.right:
                        rightLeft.append(current.right)   
                if len(levelList) != 0:
                    result.append(levelList) 
                
            if len(rightLeft) != 0:
                sizeOfCurrentLevel = len(rightLeft)
                levelList = []
                for _ in range(sizeOfCurrentLevel):
                    current = rightLeft.pop()
                    levelList.append(current.val)
                    if current.right:
                        leftRight.append(current.right)  
                    if current.left:
                        leftRight.append(current.left)
                if len(levelList) != 0:
                    result.append(levelList)  
         
        return result
        