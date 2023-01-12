class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        endOfZero = 0
        startOfOne = 0
        startOfTwo = len(nums)-1
        while startOfOne <= startOfTwo:
            if nums[startOfOne] == 2:
                nums[startOfOne],  nums[startOfTwo] = nums[startOfTwo], nums[startOfOne]
                startOfTwo-=1
            elif nums[startOfOne] == 1:
                startOfOne+=1
            else:
                nums[startOfOne],  nums[endOfZero] = nums[endOfZero], nums[startOfOne]
                endOfZero+=1
                startOfOne+=1
        
            
             
        