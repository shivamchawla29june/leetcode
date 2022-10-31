class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        # result = [[nums[i]] for i in range(len(nums))]
        # for i in range(1, len(nums)):
        #     while len(result[0]) == i:
        #         value = result.pop(0)
        #         for j in range(len(nums)):
        #             if nums[j] not in value:
        #                 newList = value[:]
        #                 newList.append(nums[j])
        #                 result.append(newList)
        # return result
        
        #Backtracking
        result = []
        def backtracking(index, currentList):
            if index == len(nums):
                result.append(currentList)
                return
            
            for i in range(len(nums)):
                if nums[i] not in currentList:    
                    newList = currentList[:]
                    newList.append(nums[i])
                    backtracking(index+1, newList)
        
        backtracking(0, [])
        return result
                    
        
        
        