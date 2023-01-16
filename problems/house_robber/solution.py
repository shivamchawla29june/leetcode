class Solution:
    def rob(self, nums: List[int]) -> int:
        
        if len(nums) == 0: return 0
        if len(nums) == 1: return nums[0]
        if len(nums) == 2: return max(nums[0],nums[1])
        
        dpMatrix = [0]*len(nums)
        dpMatrix[0] = nums[0]
        dpMatrix[1] = max(nums[0], nums[1])
        
        for i in range(2, len(nums)):
            dpMatrix[i] = max(dpMatrix[i-2]+nums[i], dpMatrix[i-1])
        
        return dpMatrix[-1]
            
            
            
        