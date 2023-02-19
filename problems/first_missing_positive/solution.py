class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            if nums[i] < 0:
                nums[i] = 0
                
        for i in range(len(nums)):
            if 1 <= abs(nums[i]) <= len(nums):
                if nums[abs(nums[i])-1] > 0:
                    nums[abs(nums[i])-1] *= -1 
                elif nums[abs(nums[i])-1] == 0:
                    nums[abs(nums[i])-1] = -1*(len(nums)+1)
        print(nums)
        for i in range(1, len(nums)+1):
            if nums[i-1] >= 0:
                return i
            
        return len(nums)+1
            
        
        