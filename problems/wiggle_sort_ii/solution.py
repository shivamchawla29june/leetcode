class Solution:
    def wiggleSort(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
#         i=1
#         while i < len(nums):
#             if i % 2 == 1 and nums[i-1] > nums[i]:
#                 nums[i-1], nums[i] = nums[i],nums[i-1]
#             if i % 2 == 0 and nums[i-1] < nums[i]:
#                 nums[i-1],nums[i] = nums[i],nums[i-1]
#             i+=1
                
#         return
        nums.sort()
        half = len(nums[::2])
        nums[::2], nums[1::2] = nums[:half][::-1], nums[half:][::-1]
        
        