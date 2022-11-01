class Solution:
    def canJump(self, nums: List[int]) -> bool:
        if len(nums) == 1: return True
        dpMatrix = [0]*len(nums)
        dpMatrix[0] = nums[0]
        for i in range(1, len(nums)-1):
            if dpMatrix[i-1] == 0:
                return False
            dpMatrix[i] = max(dpMatrix[i-1]-1, nums[i])
        return True if dpMatrix[-2] > 0 else False
        
        