# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
        def helper(arr):
            # print(arr)
            sizeOfTree = len(arr)
            if sizeOfTree==1:
                return TreeNode(arr[0])
            if sizeOfTree == 2:
                base = TreeNode(arr[1])
                base.left = TreeNode(arr[0])
                return base
            mid = sizeOfTree//2
            base = TreeNode(arr[mid])
            base.left = helper(arr[:mid])
            base.right = helper(arr[mid+1:])
            return base
        return helper(nums)
        