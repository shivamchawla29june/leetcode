import sys
class Solution:
    def increasingTriplet(self, nums: List[int]) -> bool:
        first = sys.maxsize
        second = sys.maxsize
        for i in nums:
            if i <= first:
                first = i
            elif i <= second:
                second = i
            else:
                return True
        return False
            
        
        