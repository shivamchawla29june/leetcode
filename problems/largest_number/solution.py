
from functools import cmp_to_key
        
class Solution:
    def largestNumber(self, nums):
        def cmp_func(x, y):
            """Sorted by value of concatenated string increasingly."""
            if x + y > y + x:
                return 1
            elif x == y:
                return 0
            else:
                return -1
            
        nums = [str(num) for num in nums]
        
        nums.sort(key = cmp_to_key(cmp_func), reverse = True)
        
        return "".join(nums).lstrip("0") or "0"
        