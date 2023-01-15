class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        maxConsecutive = 0
        numberSet = set(nums)
        
        for num in numberSet:
            if num - 1 not in numberSet:
                currentNumber = num
                currentStreak = 1
                
                while currentNumber + 1 in numberSet:
                    currentNumber+=1
                    currentStreak+=1
                    
                maxConsecutive = max(maxConsecutive, currentStreak)
                
        return maxConsecutive 
                
        
        
        