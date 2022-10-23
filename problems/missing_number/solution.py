class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        result=0
        for i,value in enumerate(nums):
            print(i,value)
            result^=i^value
        result^=len(nums)
        return result
        