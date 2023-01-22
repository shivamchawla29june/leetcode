class Solution:
    def numSquares(self, n: int) -> int:
        if n == 0:
            return 0
        # if int(n**0.5) == n**0.5:
        #     return 1
        dpArray = [n] * (n+1)
        dpArray[0] = 0
        for target in range(1, n+1):
            for s in range(1, target+1):
                square = s*s
                if target - square < 0:
                    break
                dpArray[target] = min(dpArray[target], 1 + (dpArray[target-square]))
                
        return dpArray[-1]
                
        
        
        
        
        