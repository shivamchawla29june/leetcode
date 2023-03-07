class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        start = end = len(nums)-1
        
        while start > 0 and nums[start-1] >= nums[start]:
            start-=1
        
        if start == 0:
            nums.reverse()
            return
        
        pivot = start - 1
        
        while nums[pivot] >= nums[end]:
            end-=1
            
        nums[pivot], nums[end] = nums[end], nums[pivot]
        left = pivot + 1
        right = len(nums)-1
        
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left+=1
            right-=1
            
            
        
        
        
            
        