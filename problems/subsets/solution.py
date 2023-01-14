class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        result = []
        if len(nums) == 0:
            return result
        def backTracking(index, currentList):
            result.append(list(currentList))
            for i in range(index, len(nums)):
                currentList.append(nums[i])
                backTracking(i+1, currentList)
                currentList.pop()
        backTracking(0, [])
        return result
        
        