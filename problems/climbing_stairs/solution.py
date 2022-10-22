class Solution:
    def climbStairs(self, n: int) -> int:
        if n<=2:
            return n
        climbData = [0,1,2]
        for i in range(3,n+1):
            climbData.append(climbData[i-1]+climbData[i-2])
        return climbData[-1]
            
        