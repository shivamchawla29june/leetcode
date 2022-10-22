class Solution:
    def mySqrt(self, x: int) -> int:
        start =0
        end = x
        
        while start<=end:
            mid = start + (end-start)//2
            if mid*mid<=x < (mid+1)*(mid+1):
                return int(mid)
            elif mid*mid<=x:
                start = int(mid)+1
            else :
                end = int(mid)-1
            
            
        